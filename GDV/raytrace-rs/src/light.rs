use crate::Vec3;


#[derive(Debug, Clone, Copy, Default)]
pub struct Light {
    pub position: Vec3,
    pub color: Vec3
}

impl Light {
    pub fn new(position: Vec3, color: Vec3) -> Self {
        Self {
            position,
            color
        }
    }
}
