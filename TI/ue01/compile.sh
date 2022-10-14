mkdir bin
cd rs
cargo build --release
cd ..
cp rs/target/release/rs bin 
strip bin/rs


cd cpp
g++ main.cpp -O3 -o ../bin/cpp
cd ..