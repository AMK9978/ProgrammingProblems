#include <iostream>
#include <math.h>
#include <algorithm>
#include <vector>
#include <string>

using namespace std;

int main()
{
	int n;
	cin >> n;
	int ftime = 60*24;
	int ltime = 0;
	for(int i=0; i<n; i++)
	{
		string time;
		cin >> time;
		//cout << time.substr(0, time.find(':')) << endl;
		//cout << time.substr(time.find(':')+1);
		int h = stoi(time.substr(0, time.find(':')));
		int m = stoi(time.substr(time.find(':')+1));
		int t = (h*60) + m;
		//cout << "time = " << t <<endl;
		if(t >= (6 * 60) + 30 && t <= 19*60)
		{
			if(t < ftime)
				ftime = t;
			if(t > ltime)
				ltime = t;
		}
	}
	//cout <<"ftime = "<<ftime <<endl <<"ltime = " << ltime <<endl ;

	if(ftime >= 6*60 +30 && ftime <= 10*60)
	{
		if(ltime >= 6*60 +30 && ltime <= 16 * 60)
		{
			cout << 24000;
		}
		else if(ltime >= 16 * 60 + 1 && ltime <= 19*60)
		{
			cout << 36000;
		}
		else
		{
			cout << 0;
		}
	}
	else if(ftime >= 10*60+1 && ftime <= 19 * 60)
	{
		if(ltime >= 16*60+1 && ltime <= 19 * 60)
		{
			cout << 24000;
			return 0;
		}
		
		if(ftime <= 16*60)
		{
			if(ltime >= 10 * 60 + 1 && ltime <= 16*60)
			{
				cout << 16800;
			}
			else
			{
				cout << 0;
			}
		}
		else
		{
			cout << 0;
		}
	}
	else if(ftime >= 10*60+1 && ftime <= 19*60)
	{
		if(ltime >= 16 * 60 + 1 && ltime <= 19*60)
		{
			cout << 24000;
		}
		else
		{
			cout << 0;
		}
	}
	else
	{
		cout << 0;
	}
	
	return 0;
}

