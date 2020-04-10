#include <iostream>
using namespace std;

int calculateSum(int A, int B) {
    return A + B;
}

int main() {
    int A, B, X;

    cin >> A;
    cin >> B;
    X = calculateSum(A, B);
    cout << "X = "<< X << endl;
    return 0;
}