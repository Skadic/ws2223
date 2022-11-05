use std::rc::Rc;

use crate::Vec3;
use super::{material::Material, Object, Intersection};

pub struct Plane {
    center: Vec3,
    normal: Vec3,
    material: Rc<Material>,
}

impl Plane {
    pub fn new(center: Vec3, normal: Vec3, material: Rc<Material>) -> Self {
        Self {
            center,
            normal,
            material
        }
    }
}

impl Object for Plane {
    fn intersect(&self, ray: &crate::ray::Ray) -> Option<Intersection> {
        if self.normal.dot(&ray.direction).abs() < 1e-6 {
            return None;
        }

        let mut intersection = Intersection {
            diffuse: self.material.diffuse,
            ..Default::default()
        };
        
        let plane_dist_from_ofigin = self.normal.dot(&self.center);
        let t = (plane_dist_from_ofigin - self.normal.dot(&ray.origin)) / self.normal.dot(&ray.direction);

        if t < 1e-5 {
            return None;
        }

        intersection.point = ray.eval(t);
        intersection.normal = self.normal;
        intersection.distance = (ray.origin - intersection.point).norm();

        Some(intersection)
    }

    fn material(&self) -> &Material {
        self.material.as_ref()
    }
}
