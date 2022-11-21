use std::fs::File;

use crate::coding::{Delta, Gamma};

mod coding;
mod lz78;
mod trie;

fn main() {
    let decompress = if let Some(opt) = std::env::args().nth(1) {
        match opt.as_str() {
            "-c" => false,
            "-d" => true,
            _ => {
                eprintln!("Invalid option \"{opt}\" must be -c or -d");
                return;
            }
        }
    } else {
        eprintln!("Please input option -c or -d");
        return;
    };

    let Some(path) = std::env::args().nth(2) else {
        eprintln!("Please input file");
        return;
    };

    let file = File::open(&path).expect("file not found");
    if !decompress {
        let outfile = File::create(path + ".lz78").expect("failed to create output file");
        lz78::compress(file, outfile, &mut Delta, &mut Gamma).unwrap();
    } else {
        let outfile = File::create(path + ".dec").expect("failed to create output file");
        lz78::decompress(file, outfile, &mut Delta, &mut Gamma).unwrap();
    }
}
