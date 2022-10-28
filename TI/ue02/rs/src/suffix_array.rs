use std::mem::MaybeUninit;

pub fn construct(s: &[u8]) -> (Vec<usize>, Vec<usize>) {
    let n = s.len();
    let (mut sa, mut isa) = count_sort_first_char(s);
    let (mut bucket_starts, max_bucket_len) = {
        let mut v = Vec::with_capacity(n);
        v.push(true);
        let mut max = 1;
        let mut current = 1;
        for i in 1..n {
            let new_bucket = s[sa[i]] != s[sa[i - 1]];
            v.push(new_bucket);
            current = if new_bucket {
                max = usize::max(current, max);
                1
            } else {
                current + 1
            };
        }
        (v, max)
    };

    let mut h = 1;
    let mut sort_buffer = Vec::with_capacity(max_bucket_len);
    loop {
        let mut done = true;
        // We have a terminator so the first bucket always starts at 1 and is 1 character long
        let mut current_bucket_start = 0;
        let mut next_bucket_start = 1;

        // Iterate through all buckets
        while current_bucket_start < n {
            // If the bucket is longer than just 1 element, sort it by another h characters
            if next_bucket_start - current_bucket_start > 1 {
                done = false;
                sort_bucket(
                    current_bucket_start,
                    next_bucket_start,
                    s,
                    sa.as_mut_slice(),
                    isa.as_mut_slice(),
                    &mut bucket_starts,
                    h,
                    &mut sort_buffer,
                )
            }

            // Find the start of the next bucket and move there
            current_bucket_start = next_bucket_start;
            for (i, &bucket_starts_here) in bucket_starts
                .iter()
                .enumerate()
                .take(n)
                .skip(next_bucket_start + 1)
            {
                if bucket_starts_here {
                    next_bucket_start = i;
                    break;
                }
            }
            // next_bucket_start wasn't changed, so we are at the end of the string
            if current_bucket_start == next_bucket_start {
                next_bucket_start = n;
            }
        }
        h <<= 1;

        if done {
            break;
        }
    }

    (sa, isa)
}

/// Sorts a bucket in the (unfinished) suffix array which is already sorted by h characters by a further h characters.
///
/// # Arguments
///
/// * `from` - The inclusive start index of the bucket
/// * `to` - The *exclusive* end index of the bucket
/// * `s` - The input string
/// * `sa` - The suffix array in construction
/// * `isa` - The inverse of the above suffix array
/// * `bucket_starts` - A slice which for each person in the input, contains true if a bucket
/// starts at that index
/// * `h` - The amount of characters according to which the suffix array is already sorted. e.g.
/// for h = 2, the se suffixes in `sa` are sorted by the first 2 characters
/// * `sort_buffer` - A vector used as a buffer for sorting suffix array positions
#[allow(clippy::too_many_arguments)]
fn sort_bucket(
    from: usize,
    to: usize,
    s: &[u8],
    sa: &mut [usize],
    isa: &mut [usize],
    bucket_starts: &mut [bool],
    h: usize,
    sort_buffer: &mut Vec<usize>,
) {
    let n = s.len();

    // Insert all the relevant indices into the sort buffer
    for i in from..to {
        sort_buffer.push(i)
    }
    // Sort the indices in the bucket by where the "arrows" land
    sort_buffer.sort_by_key(|&i| isa[sa[i] + h]);

    // Replace the indices in the sorted buffer with the actual suffix array values
    for v in sort_buffer.iter_mut() {
        *v = sa[*v];
    }

    // replace the values in the suffix array and inverse suffix array
    for (i, &sa_value) in sort_buffer.iter().enumerate() {
        sa[i + from] = sa_value;
        isa[sa_value] = i + from;
    }

    // naively compare the as of yet unmatched part of the suffix to determine bucket boundaries
    for i in from + 1..to {
        let suf_current = &s[sa[i] + h..n.min(sa[i] + 2 * h)];
        let suf_previous = &s[sa[i - 1] + h..n.min(sa[i - 1] + 2 * h)];
        if suf_previous != suf_current {
            bucket_starts[i] = true;
        }
    }

    sort_buffer.clear();
}

/// This takes a string (as a byte slice) and stably sorts each suffix by its first character.
/// Note, that you want a terminator that is smaller than all other characters as the last character in the input, like \0.
/// It returns these values as a tuple:
/// - The unfinished suffix array which by this point is only sorted by the first character
/// - The inverse array of the above
///
/// # Arguments
///
/// * `s` - The string as a byte buffer
///
/// # Examples
///
/// ```
/// let s = b"mississippi\0";
/// let (sa, isa) = count_sort_first_char(s);
/// assert_eq(sa.into_iter(), [11, 10, 7, 4, 1, 0, 9, 8, 6, 3, 5, 2]);
/// assert_eq(isa.into_iter(), [5, 4, 11, 9, 3, 10, 8, 2, 7, 6, 1, 0]);
/// ```
fn count_sort_first_char(s: &[u8]) -> (Vec<usize>, Vec<usize>) {
    // Count the occurrences of each letter
    let counts = {
        let mut buf = [0usize; 256];
        for &c in s {
            buf[c as usize] += 1;
        }
        buf
    };

    // Generate an array holding the start of each character's buffer
    let mut bucket_start = [0usize; 256];
    {
        let mut current_bucket_start = 0;
        for c in 0..256 {
            // SAFETY: i is always within bounds
            let char_count = unsafe { *counts.get_unchecked(c) };
            if char_count == 0 {
                continue;
            }
            // Set the start of the char c's bucket to the current bucket start index
            *unsafe { bucket_start.get_unchecked_mut(c) } = current_bucket_start;
            // After "inserting" a new bucket, add the count of the current character to get the
            // start of the next bucket
            current_bucket_start += char_count;
        }
    }

    // make SA and ISA two vectors but don't initialize them yet
    let mut sa = Vec::with_capacity(s.len());
    let mut isa = Vec::with_capacity(s.len());
    // Counting sort
    {
        // SAFETY: These vecs were just created
        let sa = sa.spare_capacity_mut();
        let isa = isa.spare_capacity_mut();
        // Do the first counting sort
        for (i, &c) in s.iter().enumerate() {
            let bucket = unsafe { bucket_start.get_unchecked_mut(c as usize) };
            // Fill SA and ISA
            sa[*bucket] = MaybeUninit::new(i);
            isa[i] = MaybeUninit::new(*bucket);
            *bucket += 1;
        }
    }

    // SAFETY: This is safe now since all elements are initialized
    unsafe {
        sa.set_len(s.len());
        isa.set_len(s.len());
    }

    (sa, isa)
}
