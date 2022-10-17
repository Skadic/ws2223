#include <iostream>
#include <fstream>
#include <sstream>
#include <chrono>
#include <vector>
#include <algorithm>

int main(int argc, char* argv[]) {

    using std::chrono::steady_clock;

    if (argc != 2) {
        std::cerr << "No file given" << std::endl;
        return -1;
    }

    std::string file_name = argv[1];
    std::ifstream ifs(file_name);
    std::stringstream buf;
    buf << ifs.rdbuf();

    std::vector<std::string> content;
    
    while (!buf.eof()) {
        std::string s;
        buf >> s;
        content.push_back(s);
    }

    std::vector<std::string> content2 = content;
    {
        auto now = steady_clock::now();
        std::sort(content.begin(), content.end()); 
        std::chrono::duration<double, std::milli> sort_time = steady_clock::now() - now;

        std::cout << "GNU Sort: " << sort_time.count() << "ms" << std::endl;
    }

    {
        auto now = steady_clock::now();
        std::stable_sort(content2.begin(), content2.end()); 
        std::chrono::duration<double, std::milli> sort_time = steady_clock::now() - now;

        std::cout << "GNU Stable Sort: " << sort_time.count() << "ms" << std::endl;
    }
    return 0;
}
