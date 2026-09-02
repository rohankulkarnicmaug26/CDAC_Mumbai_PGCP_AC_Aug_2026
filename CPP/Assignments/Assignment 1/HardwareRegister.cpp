//============================================================================
// Name        : 3.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================


#include <iostream>
using namespace std;

int main()
{
    int statusReg;
    int controlReg;
    int dataReg;

    cout << "Enter status register value: ";
    cin >> statusReg;

    cout << "Enter control register value: ";
    cin >> controlReg;

    cout << "Enter data register value: ";
    cin >> dataReg;

    const int *regPtr1 = &statusReg;

    cout << "Status Register: " << *regPtr1 << endl;

    int *const regPtr2 = &controlReg;

    *regPtr2 = dataReg;

    cout << "Control Register/: " << *regPtr2 << endl;

    const int *const regPtr3 = &statusReg;

    cout << "Status Register: " << *regPtr3 << endl;

    return 0;
}
