#include <bits/stdc++.h>
#define ll long long
using namespace std;

int main()
{
	int n, m, a[4] = {0}, saf;
	cin >> n;
	priority_queue<int> pq;
	for(int i=0; i<n; i++) {
		cin >> m;
		pq.push(m);
	}
	int t = 0;
	while(!pq.empty())
	{
		saf = min((int)pq.size(), 4);
		for(int i=0; i<saf; i++)
			a[i] = pq.top()-1, pq.pop();
		for(int i=0; i<saf; i++)
			if(a[i] > 0)
				pq.push(a[i]);
		t++;
	}
	
	cout << t << endl;
	return 0;
}

