#include <iostream>
#include <cstdlib>
#include <ctime>

int main() {
    const int arr_length = 99;
    char arr[arr_length];

    // Seed the random number generator with the current time
    std::srand(std::time(nullptr));

    // Generate a random array of length 99 with characters 'A', 'B', and 'C'
    for (int i = 0; i < arr_length; i++) {
        int random_num = std::rand() % 3;
        switch (random_num) {
        case 0:
            arr[i] = 'A';
            break;
        case 1:
            arr[i] = 'B';
            break;
        case 2:
            arr[i] = 'C';
            break;
        }
    }

    // Output the array
    for (int i = 0; i < arr_length; i++) {
        std::cout << arr[i] << " ";
    }
    std::cout << std::endl;

    return 0;
}