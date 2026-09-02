//============================================================================
// Name        : 2.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
#include <cmath>
using namespace std;

double computeRMS(double *p, int n)
{
    double sum = 0;

    for(int i = 0; i < n; i++)
    {
        sum = sum + (*p) * (*p);
        p++;
    }

    return sqrt(sum / n);
}

void normalise(double *p, int n)
{
    double max = 0;

    for(int i = 0; i < n; i++)
    {
        if(fabs(*p) > max)
            max = fabs(*p);

        p++;
    }

    p = p - n;

    for(int i = 0; i < n; i++)
    {
        *p = *p / max;
        p++;
    }
}

int countZeroCrossings(double *p, int n)
{
    int count = 0;

    for(int i = 0; i < n - 1; i++)
    {
        if((*p >= 0 && *(p + 1) < 0) ||
           (*p < 0 && *(p + 1) >= 0))
        {
            count++;
        }

        p++;
    }

    return count;
}

void applyGain(double *p, int n, double gain)
{
    for(int i = 0; i < n; i++)
    {
        *p = *p * gain;
        p++;
    }
}

int main()
{
    int n;

    cout << "Enter number of values : ";
    cin >> n;

    double a[100];

    cout << "Enter signal values : ";

    for(int i = 0; i < n; i++)
        cin >> a[i];

    cout << "Before : ";

    for(int i = 0; i < n; i++)
        cout << a[i] << " ";

    cout << endl;

    cout << "RMS : " << computeRMS(a, n) << endl;

    cout << "Zero Crossings : "
         << countZeroCrossings(a, n) << endl;

    normalise(a, n);

    cout << "After Normalise : ";

    for(int i = 0; i < n; i++)
        cout << a[i] << " ";

    cout << endl;

    double gain;

    cout << "Enter gain : ";
    cin >> gain;

    applyGain(a, n, gain);

    cout << "After Gain : ";

    for(int i = 0; i < n; i++)
        cout << a[i] << " ";

    cout << endl;

    return 0;
}
