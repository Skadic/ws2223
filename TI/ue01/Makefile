all: bin/rs bin/cpp
	./bin/cpp res/enwiki-titles.part.txt; ./bin/rs res/enwiki-titles.part.txt

bin: 
	mkdir bin

bin/rs: bin
	cd rs; cargo build --release; strip target/release/rs; cp target/release/rs ../bin

bin/cpp: bin
	g++ cpp/main.cpp -O3 -o bin/cpp 