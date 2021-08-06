#include <bits/stdc++.h>
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

void solve()
{

}

int main()
{
    #ifndef Test 
        acc;
    #endif

    int m,n;
	cin>>n>>m;
	string matrix[n];
	for(int i=0; i<n; i++)
		cin >> matrix[i];
    bitset<2500> row[n], res;
	for(int i=0 ;i<n;i++)
	{
	    row[i].set(0, matrix[i][0]=='*');
		for(int j=1;j<m;j++)
            row[i].set(j, matrix[i][j]=='*' ^ row[i][j-1]);
	}
    for(int i=1 ;i<n;i++)
        row[i] = row[i] ^ row[i-1];
	long long ans = 0, f, z;
	for(int i=0; i<n; i++)
	{
		for(int j=i ;j<n; j++)
		{
		    if(i > 0)   res = row[j]^row[i-1];
		    else        res = row[j];
		    f = res.count(), z = m-f;
		    ans += f*(f-1)/2 + (z+1)*(z)/2;
		}
	}

    cout << ans << endl;
    #ifdef Test 
        cout << endl; system("pause");
    #endif
    return 0;
}
