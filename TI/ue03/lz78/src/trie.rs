use std::collections::BTreeMap;

#[derive(Default)]
pub struct Node {
    parent: Option<usize>,
    content: u8,
    children: BTreeMap<u8, usize>,
}

impl Node {
    #[inline(always)]
    pub fn new(content: u8, parent: usize) -> Self {
        Self {
            content,
            children: BTreeMap::new(),
            parent: Some(parent),
        }
    }
}

pub struct Trie {
    tree: Vec<Node>,
}

impl Trie {

    /// Creates a new empty [`Trie`].
    pub fn new() -> Self {
        Self {
            tree: vec![Node::default()],
        }
    }
    
    /// Inserts a new leaf (if it doesn't already exists) into node with index 'id'
    /// that is labled with the character c
    #[inline(always)]
    pub fn insert_char_into(&mut self, character: u8, id: usize) -> usize {
        if let Some(a) = self.tree[id].children.get(&character) {
            *a
        } else {
            // Insert a new node into the vector and insert it into the children of this node
            let n = self.size();
            self.tree.push(Node::new(character, id));
            self.tree[id].children.insert(character, n);
            n
        }
    }

    /// Returns the id of the child of ndoe 'id' labled with the given character or None of no such child exists. 
    #[inline(always)]
    pub fn traverse(&self, id: usize, character: u8) -> Option<usize> {
        unsafe { self.tree.get_unchecked(id).children.get(&character).copied() }
    }

    /// Returns the character stored in the given node
    #[inline(always)]
    pub fn content(&self, id: usize) -> u8 {
        self.tree[id].content
    }

    /// Returns a node's parent if it exists
    #[inline(always)]
    pub fn parent(&self, id: usize) -> Option<usize> {
        self.tree[id].parent
    }

    #[inline(always)]
    pub fn size(&self) -> usize {
        self.tree.len()
    }
}
