#include <bits/stdc++.h>
using namespace std;
#define ll long long
const int mod = 1e9+7;
int main()
{
    string s, t;
    cin >> s >> t;
    int mini, maxi;
    ll len = 0, cnt = 1;
    for(char a='a'; a<='z'; a++)
    {
    	mini = min(count(s.begin(), s.end(), a), count(t.begin(), t.end(), a));
    	maxi = max(count(s.begin(), s.end(), a), count(t.begin(), t.end(), a));
    	if(mini == 0) continue;
    	len += mini;
    	for(int i=maxi; i>maxi-mini; i--)
    		cnt = (cnt*i) % mod;
	}
	
	cout << len << " " << cnt << endl;
    return 0;
}
