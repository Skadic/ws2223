use crate::Vec3;

#[derive(Debug, Clone, Copy)]
pub struct Ray {
    pub origin: Vec3,
    pub direction: Vec3,
}


impl Ray {
    pub fn new(origin: Vec3, mut direction: Vec3) -> Self {
        direction.normalize_mut();
        Self {
            origin,
            direction
        }
    }

    pub fn eval(&self, t: f64) -> Vec3 {
        self.origin + t * self.direction
    }
}
