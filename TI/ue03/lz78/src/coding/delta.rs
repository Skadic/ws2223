use bitstream_io::{BitWrite, BitRead};
use super::{Coder, gamma::Gamma};

#[derive(Default)]
pub struct Delta;

impl Coder for Delta {
    fn encode(&mut self, i: usize, writer: &mut impl BitWrite) -> std::io::Result<()> {
        let i = i + 1;
        let bit_len = std::mem::size_of::<usize>() * 8 - i.leading_zeros() as usize;
        Gamma.encode(bit_len, writer)?;
        writer.write(bit_len as u32 - 1, (1 << (bit_len - 1) ^ i) as u64)?;
        Ok(())
    }

    fn decode(&mut self, reader: &mut impl BitRead) -> std::io::Result<usize> {
        let bit_len = Gamma.decode(reader)? as u32;
        let res = (1 << (bit_len - 1)) | reader.read::<u64>(bit_len - 1)? as usize;
        Ok(res - 1)
    }
}