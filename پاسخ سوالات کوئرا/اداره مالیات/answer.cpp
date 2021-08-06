// <iostream> <iomanip> <algorithm> <numeric> <string> <iterator>   
// <vector> <map> <queue> <deque> <set> <bitset> <list> <stack>
#include <bits/stdc++.h> 
using namespace std;
#define ll long long
ll max(int a,ll b){ return max((ll)a,b);}
ll min(int a,ll b){ return min((ll)a,b);} 
ll min(ll a,int b){ return min(a,(ll)b);}
ll max(ll a,int b){ return max(a,(ll)b);}

int main()
{
    //int t; cin >> t; while(t--) solve();
    int n, m, q, t, a;
    cin >> n >> m;
    int chi[n];
    for(int i=0; i<n; i++) cin >> chi[i];
    
	cin >> q;
	vector<int> com[q];
	int ted[q];
	for(int i=0; i<q; i++)
	{
		cin >> t;
		com[i].resize(t);
		for(int j=0; j<t; j++)
			cin >> com[i][j];
		cin >> ted[i];
		for(int j=0; j<t; j++)
		{
			chi[com[i][j]-1] -= ted[i];
		}
	}

	long long cnt, maxi = -1;
    for(int i=0; i<(1<<n); i++)
    {
        if(__builtin_popcount(i) > m)
            continue;
    	cnt = 0;
        for(int j=0; j<q; j++)
        {
        	for(int k : com[j])
        	{
        		if( (1<<(k-1)) & i)
        		{
        			cnt += ted[j];
        			break;
				}
			}
		}

		for(int j=0; j<n; j++)
		{
			if((1<<j) & i)
    			cnt += chi[j];
		}
		maxi = max(cnt, maxi);
    }
    
    cout << maxi << endl;
    return 0;
}
