#include<bits/stdc++.h>

#define watch(x) cout<<(#x)<<" is "<<(x)<<"\n"
#define print(x) cout<<x<<"\n"
#define For(i,x,y) for(i = x; i < y; i++)
typedef std::vector<int> vi;
typedef std::vector<std::vector<int>> vvi;
typedef long long ll;
int INF = 999999;
using namespace std;


void convertToBinary(string& binary,unsigned int n)
{
    if (n / 2 != 0) {
        convertToBinary(binary, n / 2);
    }
    binary += to_string (n % 2);
}


unsigned int convertToDecimal(string binary)
{
    unsigned int n = 0;
    for(int i = binary.size () - 1; i > -1; i--){
        n += pow(2,(binary.size() - i - 1))*(binary[i] - '0');
    }
    return n;
}

int main(){
    ios_base::sync_with_stdio(false);
    unsigned int N,L,U;
    while (cin>>N>>L>>U) {
        string binary;
        convertToBinary (binary,N);
        int len = 32;
        int tmp = len - binary.size ();
        for(int i = 0; i < tmp;i++){
            binary = "0" + binary;
        }
        string l = "";
        convertToBinary (l,L);
        tmp = len - l.size ();
        for(int i = 0; i < tmp;i++){
            l = "0" + l;
        }
        len = l.size ();
        string u = "";
        convertToBinary (u,U);
        tmp = len - u.size ();
        for(int i = 0; i < tmp;i++){
            u = "0" + u;
        }
        bool flag = 0;
        string ans;
        for(int i = 0; i < l.size ();i++){
            if(l[i] - '0' != u[i] - '0'){
                if(binary[i] - '0' == 1){
                    ans += '0';
                    int j = i + 1;
                    for(; j < l.size (); j++){
                        if(l[j] - '0' == 1){
                            ans += l[j];
                        }else{
                            if(binary[j] - '0' == 1){
                                ans += '0';
                            }else{
                                ans += '1';
                                flag = 1;
                                break;
                            }
                        }
                    }
                    if(flag){
                        j++;
                        for(; j <l.size (); j++){
                            if(binary[j] - '0' == 1){
                                ans += '0';
                            }else{
                                ans += '1';
                            }
                        }
                    }
                    break;
                }else{
                    ans += '1';
                    int j = i + 1;
                    for(; j < l.size (); j++){
                        if(binary[j] - '0' == 1 && (u[j] - '0' == binary[j] - '0')){
                            ans += '0';
                            flag = 1;
                            break;
                        }else{
                            ans += u[j];
                        }
                    }
                    if(flag){
                        j++;
                        for(; j <l.size (); j++){
                            if(binary[j] - '0' == 1){
                                ans += '0';
                            }else{
                                ans += '1';
                            }
                        }
                    }
                    break;
                }
            }else{
                ans += l[i];
            }

        }
        cout<<convertToDecimal (ans)<<endl;
    }

}
