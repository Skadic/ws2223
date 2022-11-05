use std::f64::consts::PI;

use crate::{Vec3, ray::Ray};


#[derive(Default, Debug, Clone)]
pub struct Camera {
    pub eye: Vec3,
    pub center: Vec3,
    pub up: Vec3,
    pub fov_y: f64,
    pub width: usize,
    pub height: usize,
    x_dir: Vec3,
    y_dir: Vec3,
    lower_left: Vec3,
}


impl Camera {
    #[allow(unused)]
    pub fn new(eye: Vec3, center: Vec3, up: Vec3, fov_y: f64, width: usize, height: usize) -> Self {
        Self {
            eye,
            center,
            up,
            fov_y,
            width,
            height,
            ..Default::default()
        }.init()
    }

    pub fn init(mut self) -> Self {
        let view = (self.center - self.eye).normalize();
        let dist = self.center.metric_distance(&self.eye);

        let w = self.width as f64;
        let h = self.height as f64;
        let image_height = 2.0 * dist * (0.5 * self.fov_y / 180.0 * PI).tan();
        let image_width = w / h * image_height;

        self.x_dir = view.cross(&self.up).normalize() * image_width / w;
        self.y_dir = view.cross(&self.x_dir).normalize() * image_height / h;
        self.lower_left = self.center - 0.5 * w * self.x_dir - 0.5 * h * self.y_dir;
        self
    }

    pub fn primary_ray(&self, x: usize, y: usize) -> Ray {
        Ray::new(self.eye, self.lower_left + x as f64 * self.x_dir + y as f64 * self.y_dir - self.eye)
    }
}
