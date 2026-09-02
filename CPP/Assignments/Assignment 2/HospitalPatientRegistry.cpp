#include <iostream>
#include <string>
using namespace std;

class Patient
{
private:
    int patientId;
    string name;
    int age;
    string ward;
    const string bloodGroup;

public:
    Patient() : patientId(0), name("Unknown"), age(0), ward("General"), bloodGroup("O+")
    {
        cout << "[Constructor] Default patient registered." << endl;
    }

    Patient(int id, const string& n) : patientId(id), name(n), age(0), ward("Emergency"), bloodGroup("O+")
    {
        cout << "[Constructor] Emergency: " << name << endl;
    }

    Patient(int id, const string& n, int a, const string& w, const string& bg) : patientId(id), name(n), age(a), ward(w), bloodGroup(bg)
    {
        cout << "[Constructor] Full admission: " << name << endl;
    }

    ~Patient()
    {
        cout << "[Destructor] Patient " << name << " discharged." << endl;
    }

    void displayRecord() const
    {
        cout << "Patient Record:" << endl;
        cout << "ID : " << patientId << endl;
        cout << "Name : " << name << endl;
        cout << "Age : " << age << endl;
        cout << "Ward : " << ward << endl;
        cout << "Blood Grp : " << bloodGroup << endl;
    }

    void transferWard(const string& newWard)
    {
        ward = newWard;
        cout << "Ward Transfer: " << name << " -> " << newWard << endl;
    }
};

int main()
{
    int id, age;
    string name, ward, bloodGroup;

    cout << "Enter Patient ID: " << endl;
    cin >> id;

    cout << "Enter Patient Name: " << endl;
    cin >> name;

    cout << "Enter Age: " << endl;
    cin >> age;

    cout << "Enter Ward: " << endl;
    cin >> ward;

    cout << "Enter Blood Group: " << endl;
    cin >> bloodGroup;

    Patient p1(id, name, age, ward, bloodGroup);

    cout << endl;

    cout << "Enter Emergency Patient ID: " << endl;
    cin >> id;

    cout << "Enter Emergency Patient Name: " << endl;
    cin >> name;

    Patient p2(id, name);

    cout << endl;

    Patient p3;

    cout << endl;

    Patient *ptr = new Patient[4];

    for(int i = 0; i < 4; i++)
    {
        ptr[i].displayRecord();
        cout << endl;
    }

    string newWard;

    cout << "Enter new ward: " << endl;
    cin >> newWard;

    p2.transferWard(newWard);

    delete[] ptr;

    return 0;
}
