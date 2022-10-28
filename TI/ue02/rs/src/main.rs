
#[allow(unused)]
mod lcp_array;
#[allow(unused)]
mod suffix_array;

#[allow(unused)]
macro_rules! prvec {
    ($v:ident) => {
        println!(concat!(stringify!($v), ": {:?}"), &$v);
    };
}

fn main() {
    let s = b"mississippi\0";
    let (sa, _) = suffix_array::construct(s);
    let lcp = lcp_array::construct_v2(s, sa.as_slice());

    prvec!(sa);
    prvec!(lcp);
}
