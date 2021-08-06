// <iostream> <iomanip> <algorithm> <numeric> <string> <iterator>   
// <vector> <map> <queue> <deque> <set> <bitset> <list> <stack>
#include <bits/stdc++.h>
#include <ext/pb_ds/assoc_container.hpp> // Common file
#include <ext/pb_ds/tree_policy.hpp> // Including tree_order_statistics_node_update
#include <ext/pb_ds/detail/standard_policies.hpp>
//#include <windows.h>
using namespace std;
using namespace __gnu_pbds;
#ifdef Test 
    const bool TEST = false; HANDLE hConsole = GetStdHandle(STD_OUTPUT_HANDLE);
    #define cout SetConsoleTextAttribute(hConsole, 10), cout
    #define cin SetConsoleTextAttribute(hConsole, 15), cin
#else
    const bool TEST = false;
#endif
#define nl '\n'
#define ll long long
#define ld long double
#define valid(A, B, C) ( B <= A && A <= C)
#define all(x) (x).begin(), (x).end()
#define present(c,x) ((c).find(x) != (c).end())
#define pr(i) cout << setprecision(i);
#define prc(i) cout << fixed << setprecision(i);
#define rep(i , j , n) for(ll i = j ; i <= n ; i++)
#define per(i , j , n) for(ll i = j ; i >= n ; i--)
#define debug(st) cout << "debug: " << st << endl;
#define deb(n1) cout << #n1 << ": " << (n1) << endl;
#define vdeb(n1) cout << #n1 << ": "; for(const auto&value : n1) cout << value << " "; cout << endl;
#define ndeb(n1, n) cout << #n1 << ": "; rep(i, 0, n-1) cout << n1[i] << " "; cout << endl;
#define nmdeb(n1, n, m) cout << #n1 << ": \n"; for(int i=0; i<n; i++,cout<<nl) rep(j, 0, m-1) cout << n1[i][j] << " ";
#define len(n1) ((int)n1.size())
#define mp make_pair
#define pb push_back
#define fi first
#define se second
#define pii pair<int, int>
#define pll pair<ll, ll>
#define pld pair<ld, ld>
template<class T> //order_of_key, find_by_order
using orderset = tree<T, null_type, less<T>, rb_tree_tag, tree_order_statistics_node_update>;
template<class T> //order_of_key, find_by_order
using ordermultiset = tree<T, null_type, less_equal<T>, rb_tree_tag, tree_order_statistics_node_update>;
ll max(int a,ll b){ return max((ll)a,b);}
ll min(int a,ll b){ return min((ll)a,b);} 
ll min(ll a,int b){ return min(a,(ll)b);}
ll max(ll a,int b){ return max(a,(ll)b);}
ll dx[]={0,0,1,-1}, dy[]={1,-1,0,0};
ll dxk[]={0,0,1,-1,1,1,-1,-1}, dyk[]={1,-1,0,0,1,-1,1,-1};
bool isint(double d) { return (d == floor(d));}
ll gcd(ll a, ll b) { return b ? gcd(b, a%b) : a; }
ll lcm(ll a, ll b) { return a * b / gcd(a, b); }
string toBase(int n, int b) {
    string oval = "";
    while(n >= 1) {
        if(n%b < 10) oval += to_string(n%b);
        else oval += 'A' + (n%b - 10);
        n /= b;
    }
    reverse(oval.begin(), oval.end());
    return oval;
}
string toLower(string s) {
	for(auto &c : s) c = tolower(c);
	return s;
}
bool isPrime(int n) {
    if(n == 1) return false;
    for(int i=2; i<=sqrt(n); i++) if(n % i == 0) return false;
    return true;
}
map<ll, int> prfactor(ll n)
{
	map<ll, int> primes;
    while (n % 2 == 0) {  
        primes[2] ++;
    	n /= 2;  
    }  
    for (ll i = 3; i * i <= n; i = i+2) {  
        while (n % i == 0) {  
            primes[i] ++;
            n /= i;  
        }  
    }  
    if (n > 2) primes[n] ++;
    return primes;
}
ll ipow(ll a, ll b) {
    if(a == 1 || b == 0) return 1;
    ll r = 1;
    rep(i, 1, b) r *= a;
    return r;
}
const ld PI =  3.1415926535897932384626433832795;
const int inf = 2147483647;
const ll infll = 9223372036854775807;
int mod =  1000000007;//1000000007, 998244353
ll binpow(ll a,ll b) {
	if(a==1 || b==0) return 1;
	ll c = binpow(a,b/2);
	ll res = (c*c) % mod;;
	if(b%2) res = (res*(a % mod))%mod;
	return res;
}
int maxn, *fact;
ll **comb, *fibo;
void initcomb() {
	comb = new ll*[maxn];
	for(int i=0; i<maxn; i++) comb[i] = new ll[maxn];
	for(int i=0; i<maxn; i++) for(int j=0; j<maxn; j++) {
            if(i > j) 			comb[i][j] = 0;
            else if(i==0||i==j) comb[i][j] = 1;
            else			 	comb[i][j] = (comb[i-1][j-1] + comb[i][j-1])%(ll)(1e18*2);
        }
}
void initfact() {
	fact = new int[maxn];
    fact[0] = 1;
    for (int i = 1; i < maxn; ++i) fact[i] = (1LL * fact[i - 1] * i) % mod;
}
int rev(int a) {
    return binpow(a, mod - 2);
}
int choose(int a, int b) {
	if(a > b) return 0;
	return (1LL * ((1LL * fact[b] * rev(fact[a]))%mod) * rev(fact[b-a]))%mod;
}
int jaygasht(int a, int b) {
	if(a > b) return 0;
	return (1LL * fact[b] * rev(fact[b-a]))%mod;
}
void initfibo() { fibo = new ll[maxn]; fill(fibo, fibo+maxn,-1);}
ll fib(ll x) {
	if(fibo[x] != -1) return fibo[x];
    if (x <= 2) return 1;
    if (x % 2 == 0)
        return fibo[x] = (fib(x / 2) % mod * (((2 * fib(x / 2 + 1)) % mod + mod - fib(x / 2) % mod) % mod) % mod) % mod;
    return fibo[x] = ((fib(x / 2) % mod * fib(x / 2) % mod) % mod) + ((fib(x / 2 + 1) % mod * fib(x / 2 + 1) % mod) % mod);
}
int segsz, *seg;
void initseg() {
	seg = new int[2*segsz];
}
void build() {
	for (int i = segsz - 1; i > 0; --i) seg[i] = seg[i<<1] + seg[i<<1|1];
}
void update(int p, int value) {
  for (seg[p += segsz] = value; p > 1; p >>= 1) seg[p>>1] = seg[p] + seg[p^1];
}
int query(int l, int r) {
  int res = 0;
  for (l += segsz, r += segsz; l < r; l >>= 1, r >>= 1) {
    if (l&1) res += seg[l++];
    if (r&1) res += seg[--r];
  }
  return res;
}
int *parent;
void initunite() { parent = new int[maxn];  iota(parent, parent+maxn, 0);}
int findset(int x) {
    if(parent[x] == x) return x;
    return parent[x] = findset(parent[x]);
}
void unite(int x, int y) {
    parent[findset(x)] = findset(y);
}
pair<int, int> mods = {1000000007, 998244353};
vector<int> g[1000001];
bool mark[1000001];
int color[1000001];
ll n, m, k;
bool two;
void dfs(int u, int par)
{
	mark[u] = true;
	if(par != -1)
		color[u] = 1-color[par];
	for(auto v : g[u])
		if(!mark[v])
		{
			dfs(v, u);
		}
		else if(color[u] == color[v])
			two = false;
}
void Solve()
{
    maxn = 10000001;
	initfact();
    cin >> n >> m >> k;
    
    int a, b;
    rep(i, 0, m-1) cin >> a >> b, g[a].pb(b), g[b].pb(a);
    fill(mark, mark+1000001, false);
    color[1] = 1;
    two = true;
    ll khali = (n*(n-1))/2-m;
    dfs(1, -1);
    ll kol=1;
    rep(i, khali-k+1, khali)
    	kol = (kol*i)%mod;
    if(!two)
    {
    	cout << kol << endl;
    }
    else
    {
    	ll dp[2] = {0};
    	rep(i, 1, n) dp[color[i]]++;
    	ll ok = dp[0]*dp[1] - m;
    	ll gheyr = jaygasht(k, ok);
    	cout << (kol-gheyr+mod+mod)%mod << endl;
    }
}

int main() {
    mod = mods.fi;
	maxn = 1;
    if(!TEST) {ios::sync_with_stdio(false);cin.tie(0);cout.tie(0);}  // Faster Input Output
    //int t; cin >> t; while(t--) Solve();
    Solve();
    return 0;
}