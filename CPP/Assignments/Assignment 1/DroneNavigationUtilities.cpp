//============================================================================
// Name        : 5.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
#include <cmath>
using namespace std;

inline double distanceBetween(double x1, double y1, double x2, double y2)
{
    return sqrt(pow(x2 - x1, 2) + pow(y2 - y1, 2));
}

inline double toRadians(double degrees)
{
    return degrees * (3.14159 / 180.0);
}

inline double clamp(double value, double minVal, double maxVal)
{
    if(value < minVal)
        return minVal;

    if(value > maxVal)
        return maxVal;

    return value;
}

inline bool isInSafeZone(double x, double y, double cx, double cy, double radius)
{
    return distanceBetween(x, y, cx, cy) <= radius;
}

int main()
{
    double x, y;

    double homeX = 0.0;
    double homeY = 0.0;
    double radius = 50.0;

    for(int i = 1; i <= 3; i++)
    {
        cout << "Enter waypoint " << i << " X : ";
        cin >> x;

        cout << "Enter waypoint " << i << " Y : ";
        cin >> y;

        double distance = distanceBetween(homeX, homeY, x, y);

        cout << "Waypoint " << i << endl;
        cout << "Distance: " << distance << endl;

        if(isInSafeZone(x, y, homeX, homeY, radius))
            cout << "Safe Zone: Yes" << endl;
        else
            cout << "Safe Zone: No" << endl;

        cout << endl;
    }

    return 0;
}
