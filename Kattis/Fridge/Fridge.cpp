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
    int ch[1000];
    for(int i = 0; i < input.size (); i++){
        ch[input.at(i) - '0']++;
    }
    int k = 0;
    int candidate = 0;
    for(int j = 1; j < 10; j++){
        ch[j]--;
        if(ch[j] < 0){
            candidate = j;
            break;
        }
        if(j == 9){
            k++;
            j = -1;
        }
    }
    int i = 0;
    if(candidate == 0){
        cout<<1;
        i++;
    }
    for(; i < k; i++){
        cout<<candidate;
    }
    cout<<candidate<<endl;
}