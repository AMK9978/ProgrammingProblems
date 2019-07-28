#include<bits/stdc++.h>

#define watch(x) cout<<(#x)<<" is "<<(x)<<"\n"
#define print(x) cout<<x<<"\n"
#define For(i,x,y) for(i = x; i < y; i++)
typedef std::vector<int> vi;
typedef std::vector<std::vector<int>> vvi;
typedef long long ll;
int INF = 999999;
using namespace std;

struct sprinkler{
    double leftmost,rightmost,center;
};

bool cmp(const sprinkler &i1, const sprinkler &i2)
{
    return i1.leftmost < i2.leftmost;
}


int main(){
    ios_base::sync_with_stdio(false);
    int n,l,w;
    while(cin>>n>>l>>w){
        double x;
        double r;
        vector<sprinkler> vec;
        for(int i = 0; i < n;i++){
            sprinkler s;
            cin>>x>>r;
            if(r <= w/2){
                continue;
            }
            s.leftmost = x - sqrt(r*r - (w * w)/4.0);
            s.rightmost = x + sqrt(r*r - (w * w)/4.0);
            s.center = x;
            vec.push_back (s);
        }
        sort(vec.begin (),vec.end (),cmp);
        int ans = 0;
        int i = 0;
        double prev = 0;
        for (; prev < l; ) {
            int flag = 0;
            double right = prev;

            for (; i < vec.size(); i++) {
                if (vec[i].leftmost > prev) {
                    break;
                }
                if (vec[i].rightmost >= right) {
                    right = vec[i].rightmost;
                    flag = 1;
                }
            }

            if (flag == 0) {
                cout<<-1<<endl;
                break;
            }
            prev = right;
            ans++;
        }
        if (prev >= l)
            cout<<ans<<endl;

    }
}
