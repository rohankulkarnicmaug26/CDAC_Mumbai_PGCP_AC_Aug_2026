#include <iostream>
using namespace std;

int main() {

	double temperature;
	int statesCode;
	int fahrenheit;

	cout << "Enter the temperature: ";
	cin>>temperature;

	if(temperature < 0){
		statesCode = -1;
	} else if(temperature >= 0 && temperature <= 29){
		statesCode = 0;
	} else if(temperature >= 30 && temperature <= 44){
		statesCode = 1;
	} else if(temperature >= 45 && temperature <= 59){
		statesCode = 2;
	} else if(temperature >= 60){
		statesCode = 3;
	}


	fahrenheit = (temperature * 9 / 5) + 32;

	cout << "Temperature: " << temperature << " C"<< " / " << fahrenheit <<" F"<< endl;


	switch(statesCode){
	case -1:
		cout <<  "Status: SENSOR_ERROR"<<endl;
		cout << "Action: Sensor fault — check wiring"<<endl;
		break;

	case 0:
		cout << "Status : NORMAL"<< endl;
		cout << "Action : No action required" << endl;
		break;

	case 1:
		cout << "Status : WARRING" << endl;
		cout << "Action : Alert sent to supervisor" << endl;
		break;

	case 2:
		cout << "Status : CRITICAL" << endl;
		cout << "Action : Cooling system triggered" << endl;
		break;

	case 3:
		cout << "Status : SHUTDOWN" << endl;
		cout << "Action : Emergency shutdown initiated" << endl;
		break;

	}


	cout <<"Reading: " << (temperature > 25 ? "Above Average" : "Below Average") << endl;


	return 0;
}
