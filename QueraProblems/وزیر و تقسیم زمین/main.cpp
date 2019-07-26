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
    int q,x;
    cin>>q;
    vi vec;
    for(int i = 0; i < q; i++){
        cin>>x;
        vec.push_back (x);
    }
    for(int i = q; i > 0;i--){
        if(q % i == 0){
            int sum = 0;
            for(int j = 0; j < q / i; j++){
                sum += vec[j];
            }
            int j = 0;
            for(; j < i; j++){
                int temp = 0;
                for(int k = (j) * (q / i); k < (j + 1) * (q / i); k++){
                    temp += vec[k];
                }
                if(temp != sum){
                    break;
                }
            }
            if(j == i){
                cout<<i<<endl;
                return 0;
            }
        }
    }
}
