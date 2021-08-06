#include <iostream>
#include <math.h>
#include <algorithm>
#include <vector>
using namespace std;

int main()
{
	int n, m, k;
	cin >> n >> m >> k;
	bool mojod[n] = {false};
	vector<int> can;
	int temp;
	for(int i=0; i<m; i++)
	{
		cin >> temp;
		mojod[temp-1] = true;
		can.push_back(temp);
	}
	
	vector<int> vakonesh[k][2];
	for(int i=0; i<k; i++)
	{
		int p,q;
		cin >> p >> q;
		
		for(int j=0; j<p; j++)
		{
			cin >> temp;
			vakonesh[i][0].push_back(temp);
		}
		
		for(int j=0; j<q; j++)
		{
			cin >> temp;
			vakonesh[i][1].push_back(temp);
		}
	}
	bool oks[k] = {false};
	int vsize;
	bool changed = false;
	for(int i=0; i<k; i++)
	{
		
		if(oks[i] && i<k-1)
			continue;
		else if(oks[i])
		{
			if(changed)
			{
				i = -1;
				changed = false;
			}
			continue;
		}
		
		vsize = vakonesh[i][0].size();
		bool mishe = true;
		for(int j=0; j<vsize; j++)
		{
			if(mojod[vakonesh[i][0][j]-1] == false)
			{
				mishe = false;
				break;
			}
		}
		
		if(mishe)
		{
			vsize = vakonesh[i][1].size();
			for(int j=0; j<vsize; j++)
			{
				mojod[vakonesh[i][1][j]-1] = true;
			}
			changed = true;
			oks[i] = true;
		}
		
		if(i == k-1)
		{
			if(changed)
			{
				i = -1;
				changed = false;
			}
			continue;
		}
	}
	
	int tedad = 0;
	for(int i=0; i<n; i++)
	{
		if(mojod[i])
		{
			tedad++;
		}
	}
	cout << tedad << endl;
	for(int i=0; i<n; i++)
	{
		if(mojod[i])
		{
			cout << i+1 << " ";
		}
	}
	return 0;
}
