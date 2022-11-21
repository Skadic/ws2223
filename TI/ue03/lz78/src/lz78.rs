use std::{
    fmt::Display,
    io::{BufReader, BufWriter, Read, Write},
};

use bitstream_io::{BigEndian, BitReader, BitWriter};

use crate::{coding::Coder, trie::Trie};

#[derive(Clone, Copy, Debug, Default)]
struct Factor {
    node: usize,
    character: u8,
}

impl Display for Factor {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        write!(f, "({},{})", self.node, self.character as char)
    }
}

pub fn compress<NodeCoder, CharCoder>(
    input: impl Read,
    mut out: impl Write,
    node_coder: &mut NodeCoder,
    char_coder: &mut CharCoder,
) -> std::io::Result<()>
where
    NodeCoder: Coder,
    CharCoder: Coder,
{
    let mut reader = BufReader::new(input);

    let mut bw = BitWriter::endian(&mut out, BigEndian);
    let mut trie = Trie::new();
    let mut current_node = 0;

    let mut buf = [0u8];

    // We read from the input as long as we can
    while reader.read_exact(&mut buf).is_ok() {
        let c = buf[0];
        // We go to the child of the character 'c' if it exists
        if let Some(next_node) = trie.traverse(current_node, c) {
            // If it exists we just go to the node of that child
            current_node = next_node;
        } else {
            // Otherwise we insert it, add a new factor and start from the root again
            trie.insert_char_into(c, current_node);
            node_coder.encode(current_node, &mut bw)?;
            char_coder.encode(c as usize, &mut bw)?;
            current_node = 0;
        }
    }

    // Write possibly incomplete byte
    bw.flush()?;
    let (len, a) = bw.into_unwritten();
    if len > 0 {
        out.write_all(&[a << (8 - len)])?;
    }
    Ok(())
}

pub fn decompress<NodeCoder, CharCoder>(
    mut input: impl Read,
    out: impl Write,
    node_coder: &mut NodeCoder,
    char_coder: &mut CharCoder,
) -> std::io::Result<()>
where
    NodeCoder: Coder,
    CharCoder: Coder,
{
    let mut br = BitReader::endian(&mut input, BigEndian);
    let mut trie = Trie::new();

    // This stack is used for when we want to retrieve a string from the trie
    // Since we traverse from leaf to root the produced string would be backwards
    let mut stack = vec![];
    let mut writer = BufWriter::new(out);

    loop {
        // Read the new Factor
        let Ok(node) = node_coder.decode(&mut br) else {
            break;
        };
        let Ok(character) = char_coder.decode(&mut br) else {
            break;
        };
        let character = character as u8;

        // Insert the new factor into the trie
        trie.insert_char_into(character, node);

        // Output the text represented by the factor
        let mut current_node = node;
        while let Some(parent) = trie.parent(current_node) {
            stack.push(trie.content(current_node));
            current_node = parent;
        }

        while let Some(c) = stack.pop() {
            writer.write_all(&[c])?;
        }
        writer.write_all(&[character])?;
    }
    writer.flush()?;

    Ok(())
}
