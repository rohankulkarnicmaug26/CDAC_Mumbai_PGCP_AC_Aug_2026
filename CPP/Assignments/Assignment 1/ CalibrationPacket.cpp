//============================================================================
// Name        : 4.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

bool parsePacket(const int *data, int size, int **minPtr, int **maxPtr)
{
    if(size <= 0)
        return false;

    int min = 0;
    int max = 0;

    for(int i = 1; i < size; i++)
    {
        if(data[i] < data[min])
            min = i;

        if(data[i] > data[max])
            max = i;
    }

    *minPtr = const_cast<int*>(&data[min]);
    *maxPtr = const_cast<int*>(&data[max]);

    return true;
}

int main()
{
    int n;

    cout << "Enter packet size: ";
    cin >> n;

    int packet[100];

    cout << "Enter packet values: ";

    for(int i = 0; i < n; i++)
        cin >> packet[i];

    int *minPtr = nullptr;
    int *maxPtr = nullptr;

    if(parsePacket(packet, n, &minPtr, &maxPtr))
    {
        cout << "Calibration Min: " << *minPtr << endl;
        cout << "Calibration Max : " << *maxPtr << endl;
    }

    return 0;
}
