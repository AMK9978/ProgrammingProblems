#include <iostream>
#include <string>
using namespace std;


int main()
{
	int n;
	cin >> n;
	string temp;
	int bdays[n];
	int monthBeforeDays[12];
	monthBeforeDays[0] = 0;
	monthBeforeDays[1] = 31 + monthBeforeDays[0];
	monthBeforeDays[2] = 28 + monthBeforeDays[1];
	monthBeforeDays[3] = 31 + monthBeforeDays[2];
	monthBeforeDays[4] = 30 + monthBeforeDays[3];
	monthBeforeDays[5] = 31 + monthBeforeDays[4];
	monthBeforeDays[6] = 30 + monthBeforeDays[5];
	monthBeforeDays[7] = 31 + monthBeforeDays[6];
	monthBeforeDays[8] = 31 + monthBeforeDays[7];
	monthBeforeDays[9] = 30 + monthBeforeDays[8];
	monthBeforeDays[10] = 31 + monthBeforeDays[9];
	monthBeforeDays[11] = 30 + monthBeforeDays[10];
	for(int i=0; i<n; i++)
	{
		cin >> temp >> temp;
		int month = stoi(temp.substr(0,2));
		bdays[i] = monthBeforeDays[month-1] + stoi(temp.substr(3,2));
		//cout << bdays[i] << endl;
	}
	
	int maxHappiness = -1;
	int bestDay = -1;
	for(int i=301; i<=365; i++)
	{
		int mhappiness = 1000000000;
		for(int j=0; j<n; j++)
		{
			if(bdays[j] <= i)
			{
				if(i - bdays[j] < mhappiness)
					mhappiness = i - bdays[j];
			}
			else
			{
				if(365 - (bdays[j] - i) < mhappiness)
					mhappiness = 365 - (bdays[j] - i);
			}
		}
		
		if(mhappiness > maxHappiness)
		{
			bestDay = i;
			maxHappiness = mhappiness;
		}
	}
	
	for(int i=1; i<=300; i++)
	{
		int mhappiness = 1000000000;
		for(int j=0; j<n; j++)
		{
			if(bdays[j] <= i)
			{
				if(i - bdays[j] < mhappiness)
					mhappiness = i - bdays[j];
			}
			else
			{
				if(365 - (bdays[j] - i) < mhappiness)
					mhappiness = 365 - (bdays[j] - i);
			}
		}
		
		if(mhappiness > maxHappiness)
		{
			bestDay = i;
			maxHappiness = mhappiness;
		}
	}
	
	int m = -1;
	for(int i=0; i<12; i++)
	{
		if(monthBeforeDays[i] >= bestDay)
		{
			m = i;
			break;
		}
	}
	if(m == -1)
		m = 12;
	string omonth = to_string(m);
	if(m < 10)
		omonth = "0" + omonth;
	
	int ioday = bestDay - monthBeforeDays[m-1];
	
	string oday = to_string(ioday);
	//cout << ioday;
	if(ioday < 10)
		oday = "0" + oday;
	
	//cout << " check ";
	cout << omonth << "-" << oday;
}

