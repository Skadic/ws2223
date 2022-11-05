use crate::{Vec3, ray::Ray};

pub use material::*;
pub use plane::*;
pub use sphere::*;

pub mod sphere;
pub mod plane;
pub mod material;

#[derive(Debug, Clone, Copy, Default)]
pub struct Intersection {
    pub point: Vec3,
    pub normal: Vec3,
    pub diffuse: Vec3,
    pub distance: f64,
}

pub trait Object {
    fn intersect(&self, ray: &Ray) -> Option<Intersection>;
    fn material(&self) -> &Material;
}
