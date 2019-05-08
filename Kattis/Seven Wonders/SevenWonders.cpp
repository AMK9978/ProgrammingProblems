#include<bits/stdc++.h>

#define watch(x) cout<<(#x)<<" is "<<(x)<<"\n"
#define print(x) cout<<x<<"\n"
#define For(x,y) for(int i = x; i < y; i++)
typedef std::vector<int> vi;
typedef std::vector<std::vector<int>> vvi;
int n,x;

int memo[10001];

using namespace std;

int main()
{
    ios_base::sync_with_stdio(false);
    string input;
    cin>>input;
    int C = 0 , G = 0, T = 0;
    for(int i = 0; i < input.size (); i++){
        if(input.at (i) == 'C'){
            C++;
        }else if(input.at (i) == 'T'){
            T++;
        }else{
            G++;
        }
    }
    int ans = 0;
    if(C*G*T != 0){
        ans += min(C,min(G,T))*7;
    }
    ans += C*C + G*G + T*T;
    cout<<ans<<endl;
}

