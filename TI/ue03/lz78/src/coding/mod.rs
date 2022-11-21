use bitstream_io::{BitWrite, BitRead};

mod gamma;
mod delta;

pub use gamma::Gamma;
pub use delta::Delta;

pub trait Coder {
    fn encode(&mut self, i: usize, writer: &mut impl BitWrite) -> std::io::Result<()>;

    fn decode(&mut self, reader: &mut impl BitRead) -> std::io::Result<usize>;
}
