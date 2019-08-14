#include<bits/stdc++.h>

#define watch(x) cout<<(#x)<<" is "<<(x)<<"\n"
#define print(x) cout<<x<<"\n"
#define For(i,x,y) for(i = x; i < y; i++)
typedef std::vector<int> vi;
typedef std::vector<std::vector<int>> vvi;
typedef long long ll;
int INF = INT32_MIN;
using namespace std;

void fast() {
    ios::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
}


int main() {
    fast();
    long n;
    cin>>n;
    vector<long> vv;
    while(n--){
        long x;
        cin>>x;
        vv.push_back(x);
    }
    long ans = vv[0];
    for(unsigned int i = 1; i < vv.size(); i++){
        ans = __gcd(vv[i],ans);
    }
    long sum = 0;
    for(unsigned int i = 0; i < vv.size (); i++){
        sum += vv[i] / ans;
    }
    cout<<sum<<"\n";
    return 0;
}
