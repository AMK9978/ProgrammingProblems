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
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        int arr[10];
        memset (arr,0,sizeof(arr));
        for(int i = 1; i <= n; i++){
            string st = to_string (i);
            for(unsigned int j = 0; j < st.length (); j++){
                arr[st[j] - '0']++;
            }
        }
        for(int i = 0; i < 9; i++){
            cout<<arr[i]<<" ";
        }
        cout<<arr[9]<<"\n";
    }
    return 0;
}
