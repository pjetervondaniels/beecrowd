#include <iostream>
using namespace std;

double calculateArea(double radius) {
    return (3.14159) * (radius * radius);
}

int main() {
    double area, radius;
    cin >> radius;
    area = calculateArea(radius);
    printf("A = %.4f \n", area);
}