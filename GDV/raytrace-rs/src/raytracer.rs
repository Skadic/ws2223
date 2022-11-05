use std::{path::Path, rc::Rc};

use image::ImageResult;
use log::{info, warn};

use crate::{
    camera::Camera,
    image::Image,
    light::Light,
    object::{Intersection, Object, Plane},
    object::{Material, Sphere},
    ray::Ray,
    Vec3,
};

#[derive(Default)]
pub struct Raytracer {
    camera: Camera,
    image: Image,
    objects: Vec<Box<dyn Object>>,
    lights: Vec<Light>,
    max_depth: usize,
    background: Vec3,
    ambience: Vec3,
}

impl Raytracer {

    pub fn new(filename: impl AsRef<Path>) -> std::io::Result<Self> {
        let mut rt = Raytracer::default();
        rt.read_scene(filename)?;
        Ok(rt)
    }

    pub fn read_scene(&mut self, filename: impl AsRef<Path>) -> std::io::Result<()> {
        // cleanup
        self.objects.clear();
        self.lights.clear();

        let scene_content = std::fs::read_to_string(filename)?;

        for line in scene_content
            .lines()
            .map(str::trim)
            .filter(|line| !line.is_empty() && !line.starts_with('#'))
        {
            let mut tokens = line.split_whitespace();

            macro_rules! rd {
                (Vec3, $name:literal) => {
                    tokens
                        .next()
                        .expect(concat!($name, " expected fist value of vector"))
                        .parse::<f64>()
                        .and_then(|v1| {
                            tokens
                                .next()
                                .expect(concat!($name, " expected second value of vector"))
                                .parse::<f64>()
                                .map(|v2| (v1, v2))
                        })
                        .and_then(|(v1, v2)| {
                            tokens
                                .next()
                                .expect(concat!($name, " expected third value of vector"))
                                .parse::<f64>()
                                .map(|v3| (v1, v2, v3))
                        })
                        .map(|(v1, v2, v3)| Vec3::new(v1, v2, v3))
                        .expect(concat!($name, " value must be a floating point number"))
                };
                (f64, $name:literal) => {
                    tokens
                        .next()
                        .expect(concat!($name, " value expected but none given"))
                        .parse::<f64>()
                        .expect(concat!($name, " value must be a floating point number"))
                };
                (usize, $name:literal) => {
                    tokens
                        .next()
                        .expect(concat!($name, " value expected but none given"))
                        .parse::<usize>()
                        .expect(concat!($name, " value must be an unsigned integer"))
                };
                (Material) => {{
                    let ambient = rd!(Vec3, "material ambient");
                    let diffuse = rd!(Vec3, "material diffuse");
                    let specular = rd!(Vec3, "material specular");
                    let shininess = rd!(f64, "material shininess");
                    let mirror = rd!(f64, "material mirror");
                    let shadowable = {
                        let tmp = diffuse[0] < 1e-5
                            && diffuse[1] < 1e-5
                            && diffuse[2] < 1e-5
                            && specular[0] < 1e-5
                            && specular[0] < 1e-5
                            && specular[0] < 1e-5;
                        !tmp
                    };
                    Material {
                        ambient,
                        diffuse,
                        specular,
                        shininess,
                        mirror,
                        shadowable,
                        texture_png: None,
                    }
                }};
            }

            // We removed empty lines so this can't panic
            let command = tokens.next().unwrap();

            match command {
                "depth" => self.max_depth = rd!(usize, "max_depth"),
                "camera" => {
                    let mut cam = Camera::default();
                    cam.eye = rd!(Vec3, "eye");
                    cam.center = rd!(Vec3, "center");
                    cam.up = rd!(Vec3, "up");
                    cam.fov_y = rd!(f64, "y fov");
                    cam.width = rd!(usize, "width");
                    cam.height = rd!(usize, "height");
                    self.camera = cam.init();
                }
                "background" => {
                    self.background = rd!(Vec3, "background");
                }
                "ambience" => {
                    self.ambience = rd!(Vec3, "ambience");
                }
                "light" => {
                    let position = rd!(Vec3, "light position");
                    let color = rd!(Vec3, "light color");
                    self.lights.push(Light::new(position, color));
                }
                "plane" => {
                    let center = rd!(Vec3, "plane center");
                    let normal = rd!(Vec3, "plane normal");
                    let mat = Rc::new(rd!(Material));
                    self.objects.push(Box::new(Plane::new(center, normal, mat)))
                }
                "sphere" => {
                    let center = rd!(Vec3, "sphere center");
                    let radius = rd!(f64, "sphere normal");
                    let mat = Rc::new(rd!(Material));
                    self.objects
                        .push(Box::new(Sphere::new(center, radius, mat)));
                }
                "mesh" => {
                    todo!("implementing mesh objects not yet done")
                }
                _ => {
                    warn!("unknown directive: {command}")
                }
            }
        }

        info!("done processing scene ({} objects)", self.objects.len());

        Ok(())
    }

    pub fn compute_image(&mut self) {
        self.image.resize(self.camera.width, self.camera.height);

        for x in 0..self.camera.width {
            for y in 0..self.camera.height {
                let ray = self.camera.primary_ray(x, y);
                let mut color: Vec3 = self.trace(&ray, 0);

                color = Vec3::new(1f64.min(color[0]), 1f64.min(color[1]), 1f64.min(color[2]));

                *self.image.get_mut(x, y) = color;
            }
        }
    }

    pub fn write_image(&self, path: impl AsRef<Path>) -> ImageResult<()> {
        self.image.write_png(path)
    }

    fn trace(&self, ray: &Ray, depth: usize) -> Vec3 {
        if depth > self.max_depth {
            return Vec3::zeros();
        }

        let int = self.intersect_scene(ray);

        if int.is_none() {
            return self.background;
        }
        let (int, material) = int.unwrap();

        let mut color = self.lighting(&int.point, &int.normal, &-ray.direction, material);

        if material.mirror > 0.0 && depth <= self.max_depth {
            let next_ray = Ray::new(int.point, Self::mirror(&-ray.direction, &int.normal));
            color = color * (1.0 - material.mirror)
                + self.trace(&next_ray, depth + 1) * material.mirror;
        }

        color
    }

    fn intersect_scene(&self, ray: &Ray) -> Option<(Intersection, &Material)> {
        let mut t_min = f64::MAX;
        let mut res = None;
        for obj in &self.objects {
            if let Some(int) = obj.intersect(ray) {
                if int.distance < t_min {
                    res = Some((int, obj.material()));
                    t_min = int.distance;
                }
            }
        }

        res
    }

    fn lighting(&self, point: &Vec3, normal: &Vec3, view: &Vec3, material: &Material) -> Vec3 {
        // Ambient Color
        let mut color = self.ambience.component_mul(&material.ambient);

        for light in &self.lights {
            let l = (light.position - point).normalize();
            let in_angle_cos = normal.dot(&l);
            let r = 2.0 * normal * in_angle_cos - l;
            let view_diff_angle_cos = view.dot(&r);

            if in_angle_cos >= 0.0 {
                // Don't do lighting if this is in the shadow
                let shadow_ray = Ray::new(*point, light.position - point);
                if let Some((int, _)) = self.intersect_scene(&shadow_ray) {
                    if int.distance < light.position.metric_distance(point) {
                        continue;
                    }
                }

                // Diffuse light
                color += light.color.component_mul(&material.diffuse) * in_angle_cos;
                // Specular light
                color += if view_diff_angle_cos >= 0.0 {
                    light.color.component_mul(&material.specular)
                        * view_diff_angle_cos.powf(material.shininess)
                } else {
                    Vec3::zeros()
                };
            }
        }

        color
    }

    fn mirror(v: &Vec3, n: &Vec3) -> Vec3 {
        2.0 * n.dot(v) * n - v
    }
}
