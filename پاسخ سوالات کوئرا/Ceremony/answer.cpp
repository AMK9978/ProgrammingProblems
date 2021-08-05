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


int main()
{
	int n;
	cin >> n;
	int borj[n];
	
	for(int i=0; i<n; i++)
		cin >> borj[i];
		
	sort(borj, borj + n);
	int count = n;
	
	int attacks = 0;
	int mid, maxi = -1;
	
	int last = n-1;
	int chap = 0;
	int kasr = 0;
	while(count > 0)
	{
		if(borj[last] - kasr >= count)
		{
			count --;
			borj[last] = 0;
			last--;
		}
		else
		{
			kasr ++;
			for(int i=chap; i<=last; i++)
			{
				if(borj[i] == kasr)
				{
					borj[i] -= kasr;
					count --;
					chap ++;
				}
				else
				{
					break;
				}
			}
		}
		attacks ++;
	}
	
	cout << attacks;
	return 0;
}
