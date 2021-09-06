#include <bits/stdc++.h>
using namespace std;
#define ll long long
bool sortbysec(const pair<int,int> &a, const pair<int,int> &b) 
{
    return (a.second < b.second); 
}

ll choose(ll n)
{
	return (n*n + n)/2;
}

int main()
{
    int n, m;
    cin >> n >> m;
    pair<ll, ll> baze[n-1];
    for(int i=0; i<n-1; i++) cin >> baze[i].first >> baze[i].second;
    pair<ll, ll> com = make_pair(max_element(baze, baze+n-1)->first, min_element(baze, baze+n-1, sortbysec)->second);
    ll ans = choose(m) - choose(com.first-1) - choose(m-com.second);
    cout << ans << endl;
    return 0;
}
