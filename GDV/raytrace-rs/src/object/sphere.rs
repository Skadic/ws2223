use std::rc::Rc;

use crate::{ray::Ray, Vec3};

use super::{material::Material, Intersection, Object};

pub struct Sphere {
    center: Vec3,
    radius: f64,
    material: Rc<Material>,
}

impl Sphere {
    pub fn new(center: Vec3, radius: f64, material: Rc<Material>) -> Self {
        Self {
            center,
            radius,
            material,
        }
    }
}

impl Object for Sphere {
    fn intersect(&self, ray: &Ray) -> Option<Intersection> {
        let dir = ray.direction;
        let oc = ray.origin - self.center;

        let a = dir.dot(&dir);
        let b = 2.0 * dir.dot(&oc);
        let c = oc.dot(&oc) - self.radius * self.radius;
        let d = {
            let temp = b * b - 4.0 * a * c;

            if temp < 0.0 {
                return None;
            }

            temp.sqrt()
        };

        let mut intersection = Intersection::default();

        let t1 = (-b - d) / (2.0 * a);
        let t2 = (-b + d) / (2.0 * a);

        intersection.distance = f64::MAX;
        if t1 > 1e-5 && t1 < intersection.distance {
            intersection.distance = t1;
        }
        if t2 > 1e-5 && t2 < intersection.distance {
            intersection.distance = t2;
        }

        if intersection.distance != f64::MAX {
            intersection.point = ray.eval(intersection.distance);
            intersection.normal = (intersection.point - self.center) / self.radius;
        }

        Some(intersection)
    }

    fn material(&self) -> &Material {
        self.material.as_ref()
    }
}
