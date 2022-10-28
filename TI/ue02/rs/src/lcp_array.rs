use std::mem::MaybeUninit;

pub fn construct_v1_with_isa(s: &[u8], sa: &[usize], isa: &[usize]) -> Vec<usize> {
    let n = s.len();
    let mut lcp = Vec::with_capacity(n);

    let v = lcp.spare_capacity_mut();
    let mut h = 0;
    for (i, &isa_val) in isa.iter().enumerate() {
        if isa_val == 0 {
            continue;
        }
        let j = sa[isa_val - 1];
        while s[i + h] == s[j + h] {
            h += 1;
        }
        v[isa_val] = MaybeUninit::new(h);
        h = usize::max(1, h) - 1;
    }

    // SAFETY: We just created lcp with this capacity
    unsafe { lcp.set_len(n) }

    lcp
}

pub fn construct_v1(s: &[u8], sa: &[usize]) -> Vec<usize> {
    let n = s.len();
    let mut isa = Vec::with_capacity(n);
    let v = isa.spare_capacity_mut();
    for i in 0..n {
        v[sa[i]] = MaybeUninit::new(i);
    }
    // SAFETY: We just created isa with this capacity
    unsafe { isa.set_len(n) }

    construct_v1_with_isa(s, sa, &isa[..])
}

pub fn construct_v2(s: &[u8], sa: &[usize]) -> Vec<usize> {
    let n = s.len();
    let phi = {
        let mut temp = Vec::with_capacity(n);
        let v = temp.spare_capacity_mut();
        v[n - 1] = MaybeUninit::new(n - 1);
        for i in 1..n {
            v[sa[i]] = MaybeUninit::new(sa[i - 1]);
        }
        // SAFETY: We just created temp with this capacity
        unsafe { temp.set_len(n) }
        temp
    };

    let mut lcp_buf = Vec::with_capacity(n);
    let mut h = 0;
    for i in 0..n-1 {
        let j = phi[i];
        while s[i + h] == s[j + h] {
            h += 1;
        }
        lcp_buf.push(h);
        h = usize::max(1, h) - 1;
    }
    lcp_buf.push(0);

    let mut lcp = phi;
    
    for (i, lcp_pos) in lcp.iter_mut().enumerate() {
        *lcp_pos = lcp_buf[sa[i]];
    }

    lcp
}
