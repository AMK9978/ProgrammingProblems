#include <iostream>
#include <math.h>
using namespace std;

int main()
{
	int v,v2;
	cin >> v;
	double cube = cbrt(v);;
	int k = floor(cube);
	int b = ceil(cube);
	int aval1,aval2;
	for(b; b<=v; b++)
	{
		if(v%b == 0)
		{
			aval1 = b;
			break;
		}
	}
	
	for(k; k>=1; k--)
	{
		if(v%k == 0)
		{
			aval2 = k;
			break;
		}
	}
	v2 = v/aval2;
	v /= aval1;
	int dovom1, dovom2;
	double squre = sqrt(v);
	k = floor(squre);
	b = ceil(squre);
	for(b; b<=v; b++)
	{
		if(v%b == 0)
		{
			dovom1 = b;
			break;
		}
	}
	
	for(k; k>=1; k--)
	{
		if(v%k == 0)
		{
			dovom2 = k;
			break;
		}
	}
	
	squre = sqrt(v2);
	k = floor(squre);
	b = ceil(squre);
	int dovom3, dovom4;
	
	for(b; b<=v2; b++)
	{
		if(v2%b == 0)
		{
			dovom3 = b;
			break;
		}
	}
	
	for(k; k>=1; k--)
	{
		if(v2%k == 0)
		{
			dovom4 = k;
			break;
		}
	}
	
	
	int sevom1 = v/dovom1;
	int sevom2 = v/dovom2;
	int sevom3 = v2/dovom3;
	int sevom4 = v2/dovom4;
	
	int mini = min((aval1*dovom1*2) + (aval1*sevom1*2) + (dovom1*sevom1*2) , (aval1*dovom2*2) + (aval1*sevom2*2) + (dovom2*sevom2*2));
	int mini2 = min((aval2*dovom3*2) + (aval2*sevom3*2) + (dovom3*sevom3*2) , (aval2*dovom4*2) + (aval2*sevom4*2) + (dovom4*sevom4*2));
	int mini3 = min(mini,mini2);
	cout << mini3;
	
	return 0;
}
