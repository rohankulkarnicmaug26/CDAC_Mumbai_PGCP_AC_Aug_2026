#include <iostream>
using namespace std;

void resetSensorPairV1(int a, int b)
{
    int temp = a;
    a = b;
    b = temp;
}

void resetSensorPairV2(int &a, int &b)
{
    int temp = a;
    a = b;
    b = temp;
}

void resetSensorPairV3(int *a, int *b)
{
    int temp = *a;
    *a = *b;
    *b = temp;
}

int main()
{
    int a, b;

    cout << "Enter A : ";
    cin >> a;

    cout << "Enter B : ";
    cin >> b;

    cout << "V1: Call by Value" << endl;
    cout << "Before : A=" << a << " B=" << b << endl;

    resetSensorPairV1(a, b);

    cout << "After : A=" << a << " B=" << b << endl;

    cout << "V2: Call by Reference" << endl;
    cout << "Before : A=" << a << " B=" << b << endl;

    resetSensorPairV2(a, b);

    cout << "After : A=" << a << " B=" << b << endl;

    cout << "V3: Call by Pointer" << endl;
    cout << "Before : A=" << a << " B=" << b << endl;

    resetSensorPairV3(&a, &b);

    cout << "After : A=" << a << " B=" << b << endl;

    return 0;
}
