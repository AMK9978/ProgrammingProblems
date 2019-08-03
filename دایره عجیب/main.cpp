#include<bits/stdc++.h>

#define watch(x) cout<<(#x)<<" is "<<(x)<<"\n"
#define print(x) cout<<x<<"\n"
#define For(i,x,y) for(i = x; i < y; i++)
typedef std::vector<int> vi;
typedef std::vector<std::vector<int>> vvi;
typedef long long ll;
int INF = 999999;
using namespace std;

int main(){
    ios_base::sync_with_stdio(false);
    int n,k;
    cin>>n>>k;
    int x = k;
    int i = 1;
    x = x% n;
    while(x != 0){
        i++;
        x += k;
        x = x % n;
    }
    cout<<i<<endl;
}
