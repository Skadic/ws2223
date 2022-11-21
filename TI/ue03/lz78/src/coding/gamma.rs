use bitstream_io::{BitWrite, BitRead};

use super::Coder;

#[derive(Default)]
pub struct Gamma;

impl Coder for Gamma {
    fn encode(&mut self, i: usize, writer: &mut impl BitWrite) -> std::io::Result<()> {
        let i = i + 1;
        let bit_len = std::mem::size_of::<usize>() as u32 * 8 - i.leading_zeros();
        writer.write(bit_len - 1, 0)?;
        writer.write(bit_len, i as u64)?;
        Ok(())
    }

    fn decode(&mut self, reader: &mut impl BitRead) -> std::io::Result<usize> {
        let mut bit_len = 0;
        while !reader.read_bit()? {
            bit_len += 1;
        }
        let res = (1 << bit_len) | reader.read::<u64>(bit_len)? as usize;
        Ok(res - 1)
    }
}