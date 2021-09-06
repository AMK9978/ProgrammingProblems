#include <iostream>
#include <algorithm>
#include <vector>
#include <iomanip>
#include <string>
#include <string.h>
#include <math.h>
#include <queue>
#include <map>
using namespace std;
#define ll long long

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
	int k;
	cin >> k;
	
	ll hasel = 1;
	for(int i=1; i<sqrt(k); i++)
	{
		if(k % i == 0)
		{
			if(isPrime(i))
				hasel *= i;
			if(isPrime(k/i))
				hasel *= k/i;
		}
	}
	
	if(floor(sqrt(k)) == sqrt(k))
	{
		int jazr = sqrt(k);
		if(isPrime(jazr))
			hasel *= jazr;
	}
	
	
	cout << hasel;
	return 0;	
}
