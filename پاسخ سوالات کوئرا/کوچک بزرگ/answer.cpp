#include <iostream>
#include <math.h>
using namespace std;

bool isPrime(int num)
{
	if(num == 1)
		return false;
	for(int i=2; i<=sqrt(num); i++)
	{
		if(num % i == 0)
			return false;
	}
	return true;
}

int main()
{
	int n;
	cin >> n;
	if(n == 1)
	{
		cout << 1;
		return 0;
	}
	else if(n == 4)
	{
		cout << 4;
		return 0;
	}

	for(int i=n; i>=1; i--)
	{
		if(isPrime(i))
		{
			cout << i;
			break;
		}
	}
	return 0;
}
	

