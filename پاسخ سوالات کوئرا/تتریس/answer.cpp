#include <bits/stdc++.h>
#define ll long long
using namespace std;
ll n, k;
ll a[1000001];
ll ans = 0;
int mid_max(int l, int r)
{
	int maxi=-1, max_id;
	int mid = (l+r)/2;
	for(int i=l; i<=r; i++)
	{
		if(a[i] > maxi)
			maxi = a[i], max_id=i;
		else if(a[i] == maxi && abs(mid-i) < abs(mid-max_id))
			max_id = i;
	}
	return max_id;
}

void solve(int l, int r, int e)
{
	if(l > r) return;
	if(l == r)
	{
		ans += k-(a[l]+e);
		return;
	}
	int midmax = mid_max(l, r);
	
	ans += k - (a[midmax]+e);
	e += k - (a[midmax]+e);
	solve(l, midmax-1, e);
	solve(midmax+1, r, e);
}

int main()
{
	cin >> n;
	for(int i=0; i<n; i++) cin >> a[i];
	ll* max_id = max_element(a, a+n);
	k = *max_id;
	solve(0, n-1, 0);
	cout << ans << endl;
	return 0;
}

