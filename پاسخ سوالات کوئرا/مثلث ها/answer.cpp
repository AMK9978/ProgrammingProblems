#include <iostream>
using namespace std;

int main()
{
	int n;
	cin >> n;
	
	for(int i=0; i<n*4+1; i++)
	{
		int s = (i)%4;
		int t = i/4;
		for(int j=0; j<4*(n-t)-s; j++)
			cout << " ";
		
		if(s == 0)
		{
			for(int j=0; j<t*8+1; j++)
				cout << "*";

			cout << endl;
			continue;
		}
		
		cout << "*";
		for(int j=0; j<2*t+1; j++)
		{
			if(j % 2 == 0)
				for(int m=0; m<2*s-1; m++)
					cout << " ";
			else
				for(int m=0; m<6-2*s+1; m++)
					cout << " ";
			cout << "*";
		}
		

		cout << endl;
	}
	return 0;
}
