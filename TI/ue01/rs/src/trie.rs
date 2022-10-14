use std::collections::BTreeMap;

pub struct Trie {
    tree: Option<Node>,
    size: usize,
}

#[allow(unused)]
impl Trie {
    pub fn new() -> Self {
        Self {
            tree: None,
            size: 0,
        }
    }

    pub fn insert(&mut self, s: impl AsRef<str>) {
        if let Some(ref mut tree) = self.tree {
            if tree.insert(s) {
                self.size += 1;
            }
        } else {
            self.tree = Some(Node::new(s));
            self.size += 1;
        }
    }

    pub fn root(&self) -> Option<&Node> {
        self.tree.as_ref()
    }

    pub fn print_all_strings(&self) {
        if let Some(node) = self.root() {
            let mut segments = vec![];
            let mut chars = vec![];
            node.print_all_strings(&mut segments, &mut chars);
        }
    }

    pub fn sorted_strings(&self) -> Vec<String> {
         if let Some(node) = self.root() {
            let mut out = Vec::with_capacity(self.size());
            let mut segments = vec![];
            let mut chars = vec![];
            node.sorted_strings(&mut segments, &mut chars, &mut out);

            out
        } else {
            Vec::new()
        }
    }

    pub fn size(&self) -> usize {
        self.size
    }
}

pub struct Node {
    content: String,
    children: BTreeMap<char, Node>,
}

impl Node {
    fn new(s: impl AsRef<str>) -> Self {
        Self {
            content: s.as_ref().to_owned(),
            children: BTreeMap::new(),
        }
    }

    fn new_raw(s: impl AsRef<str>, map: BTreeMap<char, Node>) -> Self {
        Self {
            content: s.as_ref().to_owned(),
            children: map,
        }
    }

    fn insert(&mut self, s: impl AsRef<str>) -> bool {
        let s = s.as_ref();
        let content_len = self.content.len();

        let mut split = None;
        for (i, (s_char, content_char)) in s.chars().zip(self.content.chars()).enumerate() {
            if s_char != content_char {
                split = Some(i);
                break;
            }
        }

        // In this case, one string is a prefix of the other
        // If our new string is the prefix, then the string is already contained in the trie, we don't need to do anything
        // If the strings are equal, then that is the case too
        // So the only case worth mentioning is the one where our new string is longer
        if split.is_none() {
            if content_len < s.len() {
                let query_char = unsafe { *s.as_bytes().get_unchecked(content_len) } as char;
                let query_string = unsafe { s.get_unchecked(content_len + 1..) };

                return if let Some(child) = self.children.get_mut(&query_char) {
                    child.insert(query_string)
                } else {
                    self.children.insert(query_char, Self::new(query_string));
                    true
                };
            } else {
                return false;
            }
        }

        // We know this is fine now
        let split = split.unwrap();

        // We now have a new split in the trie.
        // We need to keep the part of the content that is common between the two strings
        // The rest is going to go into two new children

        let query_char = unsafe { *s.as_bytes().get_unchecked(split) } as char;
        let query_string = unsafe { s.get_unchecked(split + 1..) };

        let split_char = unsafe { *self.content.as_bytes().get_unchecked(split) } as char;
        let content_suffix = unsafe { self.content.get_unchecked(split + 1..) };

        let old_children = std::mem::take(&mut self.children);
        self.children.insert(query_char, Node::new(query_string));
        self.children
            .insert(split_char, Node::new_raw(content_suffix, old_children));

        // We need to cut off the content that is now stored in the children
        self.content.truncate(split);

        true
    }

    fn print_all_strings<'a>(&'a self, segments: &mut Vec<&'a str>, chars: &mut Vec<char>) {
        if self.children.is_empty() {
            for (&seg, c) in segments.iter().zip(chars.iter()) {
                print!("{}{}", seg, c)
            }
            println!("{}", self.content);
            return;
        }

        segments.push(&self.content);
        for (&c, child) in self.children.iter() {
            chars.push(c);
            child.print_all_strings(segments, chars);
            chars.pop();
        }
        segments.pop();
    }

    fn sorted_strings<'a>(
        &'a self,
        segments: &mut Vec<&'a str>,
        chars: &mut Vec<char>,
        out: &mut Vec<String>,
    ) {
        if self.children.is_empty() {
            out.push(segments
                .iter()
                .zip(chars.iter())
                .flat_map(|(&segment, &c)| segment.chars().chain(std::iter::once(c)))
                .collect::<String>());
            return;
        }

        segments.push(&self.content);
        for (&c, child) in self.children.iter() {
            chars.push(c);
            child.sorted_strings(segments, chars, out);
            chars.pop();
        }
        segments.pop();
    }
}
