use std::path::Path;

use image::{ImageBuffer, Rgb};

use crate::Vec3;


#[derive(Debug, Clone, Default)]
pub struct Image {
    pixels: Vec<Vec3>,
    width: usize,
    height: usize,
}

impl Image {
    #[allow(unused)]
    pub fn new(width: usize, height: usize) -> Self {
        Self {
            pixels: vec![Vec3::zeros(); width * height],
            width,
            height
        }
    }

    #[inline(always)]
    pub fn width(&self) -> usize {
        self.width
    }

    #[inline(always)]
    pub fn height(&self) -> usize {
        self.height
    }

    pub fn resize(&mut self, width: usize, height: usize) {
        self.width = width;
        self.height = height;
        self.pixels.resize(width * height, Vec3::zeros());
    }

    #[allow(unused)]
    pub fn get(&self, x: usize, y: usize) -> &Vec3 {
        let i = y * self.width() + x;
        &self.pixels[i]
    }

    pub fn get_mut(&mut self, x: usize, y: usize) -> &mut Vec3 {
        let i = y * self.width() + x;
        &mut self.pixels[i]
    }

    pub fn write_png(&self, path: impl AsRef<Path>) -> image::ImageResult<()> {
        let mut rgb = Vec::with_capacity(3 * self.width * self.height);

        for y in 0..self.height() {
            for x in 0..self.width() {
                for c in 0..3 {
                    unsafe { rgb.push((255.0 * self.pixels.get_unchecked(y * self.width + x).get_unchecked(c)) as u8) }
                }
            }
        }

        let buf = ImageBuffer::<Rgb<u8>, _>::from_raw(self.width as u32, self.height as u32, rgb).unwrap();

        buf.save(path)?;
        
        Ok(())
    }

    #[allow(unused)]
    pub fn read(&self, path: impl AsRef<Path>) -> bool {
        todo!()
    }
}
