#include <iostream>
using namespace std;

int main()
{
    double a[3][3];

    for(int i = 0; i < 3; i++)
    {
        cout << "Floor " << i + 1 << endl;

        for(int j = 0; j < 3; j++)
        {
            cout << "Room " << j + 1 << " : ";
            cin >> a[i][j];
        }
    }

    double hot = a[0][0];
    int hotFloor = 0;
    int hotRoom = 0;
    int warning = 0;

    double highAvg = 0;
    int highFloor = 0;

    for(int i = 0; i < 3; i++)
    {
        double sum = 0;

        for(int j = 0; j < 3; j++)
        {
            sum = sum + a[i][j];

            if(a[i][j] > hot)
            {
                hot = a[i][j];
                hotFloor = i;
                hotRoom = j;
            }

            if(a[i][j] >= 30)
                warning++;
        }

        double avg = sum / 3;

        if(i == 0 || avg > highAvg)
        {
            highAvg = avg;
            highFloor = i;
        }
    }

    cout << endl;
    cout << "        Room1 Room2 Room3" << endl;

    for(int i = 0; i < 3; i++)
    {
        cout << "Floor " << i + 1 << " : ";

        for(int j = 0; j < 3; j++)
        {
            cout << a[i][j] << " ";
        }

        cout << endl;
    }

    cout << "Hottest Room : Floor " << hotFloor + 1;
    cout << ", Room " << hotRoom + 1;
    cout << " -> " << hot << "°C" << endl;

    cout << "Hottest Floor : Floor " << highFloor + 1;
    cout << " (avg " << highAvg << "°C)" << endl;

    cout << "Rooms at WARNING or above : " << warning << endl;

    return 0;
}
