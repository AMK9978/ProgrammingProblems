#include <iostream>
using namespace std;

int main()
{
	int a[3];
	cin >> a[0] >> a[1] >> a[2];
	bool able[3] = {false};
	int evens = 0, odds = 0;
	for(int i=0; i<3; i++)
	{
		if(a[i] % 2 == 0)
		{
			evens ++;
		}
		else
		{
			odds ++;
		}
	}
	
	if(odds == 1 && evens == 2)
	{
		for(int i=0; i<3; i++)
		{
			if(a[i] % 2 == 1)
			{
				able[i] = true;
				break;
			}
		}
	}
	else if(odds == 2 && evens == 1)
	{
		for(int i=0; i<3; i++)
		{
			if(a[i] % 2 == 0)
			{
				able[i] = true;
				break;
			}
		}
	}
	
	for(int i=0; i<3; i++)
	{
		if(able[i])
			cout << "YES ";
		else
			cout << "NO ";
	}
}
