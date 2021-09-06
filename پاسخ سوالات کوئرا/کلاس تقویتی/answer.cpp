#include <iostream>
#include <math.h>
using namespace std;

#define ll unsigned long long

int main()
{
	string ns;
	cin >> ns;
	
	if(ns.length() == 1)
	{
		if((int)(ns[0]-'0') <= 2)
			cout << ns;
		else
			cout << (int)(ns[0] - '0') - 1;
	}
	else
	{
		for(int i=ns.length()-1; i>=0; i--)
		{
			if(ns[i] >= '1')
			{
				ns[i] -= 1;
				break;
			}
			else
			{
				ns[i] = '9';
			}
		}
		if(ns[0] == '0')
		{
			ns.erase(0,1);
		}
		
		cout << ns;
	}
	
	
	return 0;
}
