use crate::{Vec3, image::Image};


#[derive(Debug, Clone)]
pub struct Material {
    pub ambient: Vec3,
    pub diffuse: Vec3,
    pub specular: Vec3,
    pub shininess: f64,
    pub mirror: f64,
    pub shadowable: bool,
    pub texture_png: Option<Image>
}
