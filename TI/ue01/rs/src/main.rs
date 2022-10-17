use std::{process, time::Instant};

use trie::Trie;

mod trie;

fn main() -> std::io::Result<()> {
    let file = if let Some(file) = std::env::args().skip(1).next() {
        file
    } else {
        eprintln!("No file given");
        process::exit(101);
    };

    let strings = std::fs::read_to_string(file)?;

    let mut trie = Trie::new();


    let mut strings = strings
        .lines()
        .map(|l| l.trim())
        .collect::<Vec<_>>();

    let now = Instant::now();
    for string in strings.iter() {
        trie.insert(string)
    }

    let trie_insert_duration = Instant::now() - now;
    let now = Instant::now();
    trie.sorted_strings();
    let trie_sort_duration = Instant::now() - now;


    let mut s = strings.clone();
    let now = Instant::now();
    s.sort_unstable();
    let unstable_sort_duration = Instant::now() - now;

    let now = Instant::now();
    strings.sort();
    let sort_duration = Instant::now() - now;


    println!("Trie insert: {}ms", trie_insert_duration.as_millis());
    println!("Trie sort: {}ms", trie_sort_duration.as_millis());
    println!("Trie total: {}ms", trie_insert_duration.as_millis() + trie_sort_duration.as_millis());
    println!("Unstable sort : {}ms", unstable_sort_duration.as_millis());
    println!("Stable sort : {}ms", sort_duration.as_millis());

    Ok(())
}
