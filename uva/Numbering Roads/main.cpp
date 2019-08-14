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
    double R,N;
    int t = 1;
    while(cin>>R>>N){
        if((N == R) && N == 0){
            break;
        }
        if(R - N < 0){
            cout<<"Case "<<t<<": 0\n";
        }else if(N == R){
            cout<<"Case "<<t<<": 1\n";
        }else{
            R -= N;
            int ans = (int)ceil(R / N);
            if(ans <= 26){
                cout<<"Case "<<t<<": "<<ans<<"\n";
            }else{
                cout<<"Case "<<t<<": "<<"impossible\n";
            }
        }
        t++;
    }
    return 0;
}
