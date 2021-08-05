#include <iostream>
#include <math.h>
#include <algorithm>
#include <numeric>
#include <vector>
#include <map>
#include <iomanip>
#include <string.h>
#include <string>
#include <queue>
#include <deque>
#include <bitset>
#include <iterator>
#include <list>
#include <stack>
#include <set>
using namespace std;

const char nl = '\n';
#define IN(A, B, C) assert( B <= A && A <= C)
#define PI 3.1415926535897932384626433832795
#define tr(c,i) for(__typeof__((c)).begin() i = (c).begin(); i != (c).end(); i++)
#define present(c,x) ((c).find(x) != (c).end())
#define cpresent(c,x) (find(all(c),x) != (c).end())
#define sz(a) int((a).size())
#define acc ios::sync_with_stdio(false);cin.tie(0);cout.tie(0);
#define ll long long
#define ld long double
#define inf 2147483647
#define infll 9223372036854775807
#define pr(i) cout << setprecision(i);
#define prc(i) cout << fixed << setprecision(i);
#define endl '\n'
#define all(x) (x).begin(), (x).end()
#define rall(x) (x).rbegin, (x).rend()
#define rep(i , j , n) for(ll i = j ; i <= n ; i++)
#define per(i , j , n) for(ll i = j ; i >= n ; i--)
#define debug(n1) cout << #n1 << ": " << (n1) << endl
#define adebug(n1) cout << #n1 << ": "; rep(i, 0, (sizeof(n1)/sizeof(*n1))-1) cout << n1[i] << " "; cout << endl;
#define vdebug(n1) cout << #n1 << ": "; rep(i, 0, n1.size()-1) cout << n1[i] << " "; cout << endl;
#define bdebug(n1) cout << #n1 << ": "; for(const auto&value : n1) cout << value << " "; cout << endl;
#define ndebug(n1, n) cout << #n1 << ": "; rep(i, 0, n-1) cout << n1[i] << " "; cout << endl;
#define ell endl << endl;
//#define max(a, b) ((a > b) ? a : b)
//#define min(a, b) ((a < b) ? a : b)
ll max(int a,ll b){ return max((ll)a,b);}
ll min(int a,ll b){ return min((ll)a,b);} 
ll min(ll a,int b){ return min(a,(ll)b);}
ll max(ll a,int b){ return max(a,(ll)b);}
#define mp make_pair
#define pb push_back
#define fi first
#define se second
ll dx[]={0,0,1,-1};
ll dy[]={1,-1,0,0};
ll dxk[]={0,0,1,-1,1,1,-1,-1};
ll dyk[]={1,-1,0,0,1,-1,1,-1};
bool isint(double d) { return (d == floor(d));}
bool isint(float d) { return (d == floor(d));}
ll gcd(ll a, ll b) { return b ? gcd(b, a%b) : a; }
ll lcm(ll a, ll b) { return a * b / gcd(a, b); }
ll ipow(ll a, ll b)
{
    ll r = 1;
    rep(i, 1, b) r *= a;
    return r;
}
#define mod 1000000007//1000000007, 998244353
ll power(ll a,ll b){
	if(a==1 || b==0)
		return 1;
	ll c = power(a,b/2);
	ll res = (c*c) % mod;;
	if(b%2)
		res = (res*(a % mod))%mod;
	return res;
}
bool isPrime(int n)
{
    if(n == 1)
        return false;
    for(int i=2; i<=sqrt(n); i++)
    {
        if(n % i == 0)
            return false;
    }

    return true;
}
string toBase(int n, int b)
{
    string oval = "";
    while(n >= 1)
    {
        if(n%b < 10)
            oval += to_string(n%b);
        else
            oval += 'A' + (n%b - 10);
        n /= b;
    }
    reverse(oval.begin(), oval.end());
    return oval;
}

void solve()
{

}

int main()
{
    #ifndef Test 
        acc;
    #endif
    int n;
    cin >> n;
    string name[n];
    rep(i, 0, n-1) cin >> name[i];

    int maxi = -1;
    set<char> harf;
    rep(i, 0, n-1)
    {
        harf.clear();
        rep(j, 0, name[i].length()-1)
        {
            harf.insert(name[i][j]);
        }
        if((int)harf.size() > maxi)
            maxi = (int)harf.size();
    }
    
    cout << maxi << endl;
    #ifdef Test 
        cout << endl; system("pause");
    #endif
    return 0;
}
