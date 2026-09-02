#include <iostream>
using namespace std;

int main() {

    int n;
    double temperature[100];

    cout <<"Enter number of readings: ";
    cin>>n;

    if (n < 1 || n > 100) {
        cout << "Invalid number of readings";
        return 0;
    }

    for (int i = 0; i < n; i++) {
        cout << "Enter reading: " <<i + 1<<" ";
        cin >> temperature[i];
    }

    int skipped = 0;
    int normal = 0;
    int warning = 0;
    int critical = 0;
    int shutdown = 0;

    double min = 0;
    double max = 0;
    double sum = 0;

    int validCount = 0;

    cout << "Valid readings: "<<endl;

    for (int i= 0;i < n; i++) {

        if (temperature[i] < 0) {
            skipped++;
            continue;
        }

        cout <<temperature[i] << " ";


        if (validCount == 0) {
            min = temperature[i];
            max = temperature[i];
        }

        if (temperature[i] < min) {
            min= temperature[i];
        }

        if (temperature[i] > max) {
            max =temperature[i];
        }

        sum =sum + temperature[i];
        validCount++;

        if (temperature[i] <= 29) {
            normal++;
        }
        else if (temperature[i] >= 30 && temperature[i] <= 44) {
            warning++;
        }
        else if (temperature[i] >= 45 && temperature[i] <= 59) {
            critical++;
        }
        else {
            shutdown++;
        }
    }

    // Find first critical reading
    for (int i = 0; i < n; i++) {

        if (temperature[i] >= 45) {
            cout << "\nFirst CRITICAL: Index "
                 << i + 1 << " -> "
                 << temperature[i] << "C";

            break;
        }
    }

    cout << "Skipped (errors): " << skipped << endl;

    cout <<"Min: " << min << endl;
    cout<<"Max: " << max << endl;
    cout<<"Average: " << sum / validCount << endl;

    cout << "Normal: " << normal << endl;
    cout <<"Warning: " << warning<<endl;
    cout<< "Critical: " << critical <<endl;
    cout << "Shutdown: "<< shutdown << endl;
    return 0;
}
