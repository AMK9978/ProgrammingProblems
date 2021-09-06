#include <bits/stdc++.h>
using namespace std;

int main()
{
    long long n, k;
    cin >> n >> k;
    pair<int, int> a[n];
    for(int i=0; i<n; i++) cin >> a[i].first >> a[i].second;
    sort(a, a+n);
    
    for(int i=0; i<n; i++)
    {
        if(k >= a[i].first && a[i].first < a[i].second)
        {
            k -= a[i].first;
            k += a[i].second;
        }
    }
    
    cout << k << endl;
    
    return 0;
}
