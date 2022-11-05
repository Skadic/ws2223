use nalgebra::Vector3;
use crate::raytracer::Raytracer;

mod camera;
mod image;
mod light;
mod object;
mod ray;
mod raytracer;

pub(crate) type Vec3 = Vector3<f64>;

fn main() {
    if std::env::var("RUST_LOG").is_err() {
        std::env::set_var("RUST_LOG", "info");
    }

    pretty_env_logger::init();

    let mut args = std::env::args().skip(1);
    let in_filename = args.next().expect("Please input scene file and output file");
    let out_filename = args.next().expect("Please input scene file and output file");

    let mut rt = Raytracer::new(in_filename).expect("error creating raytracer");


    rt.compute_image();
    rt.write_image(out_filename).expect("Error writing image");
}
