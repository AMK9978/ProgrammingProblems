#include <iostream>
#include <math.h>
#include <algorithm>
using namespace std;

int main()
{
	int n, d;
	cin >> n >> d;
	int tile[n];
	for(int i=0; i<n; i++)
		cin >> tile[i];
	
	int num=0;
	int index = -1;
	int maxsMinimum = 1000000000;
	int m = -1;
	for(int i=0; i<d; i++)
	{
		int index = i;
		int z=0, f=0;
		while(index < n)
		{
			if(tile[index] % 2 == 0)
				z++;
			else
				f++;
			index += d;
		}
		
		num += min(z , f);
		if(max(z, f) < maxsMinimum)
		{
			maxsMinimum = max(z, f);
			m = min(z, f);
			index = i;
		}
		
		if(min(z, f) == z)
		{
			int ind = i;
			while(ind < n)
			{
				if(tile[ind] % 2 == 0)
					tile[ind] ++;
				ind += d;
			}
		}
		else
		{
			int ind = i;
			while(ind < n)
			{
				if(tile[ind] % 2 == 1)
					tile[ind] ++;
				ind += d;
			}
		}
	}
	
	bool zojiat = true;
	for(int i=0; i<d; i++)
	{
		if(tile[i] % 2 == 1)
			zojiat = !zojiat;
	}
	
	if(zojiat)
		cout << num;
	else
	{
		num -= m;
		num += maxsMinimum;
		cout << num;
	}
	
	return 0;
}
