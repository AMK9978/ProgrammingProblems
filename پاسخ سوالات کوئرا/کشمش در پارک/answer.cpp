#include <bits/stdc++.h>
using namespace std;

int main()
{
	int n, m;
	cin >> n >> m;
    long long jad[n][m], dp[n][m];
    for(int i=0; i<n; i++)
    	for(int j=0; j<m; j++)
    		cin >> jad[i][j];
    
    long long maximum_of_all = 0;
    memset(dp, 0, sizeof(long long)*n*m);

    for(int i=n-1; i>=0; i-=2)
    {
    	for(int j=m-1; j>=0; j--)
    	{
    		if(jad[i][j] == 0)
    		    continue;
    		if(i == n-1)
    	        dp[i][j] = jad[i][j];
    		int paiin;
    		if(((n-1)/2 - i/2)% 2 == 0)
    			paiin = j-1;
    		else
    			paiin = j+1;
            
    		if(i < n-1 && paiin >= 0 && paiin <= m-1 && dp[i+2][paiin] != 0)
    			dp[i][j] = max(dp[i][j], jad[i][j] + dp[i+2][paiin]);
    		if(j < m-1 && dp[i][j+1] != 0)
    			dp[i][j] = max(dp[i][j], jad[i][j] + dp[i][j+1]);
		}
	}
	
	for(int i=0; i<m; i++)
	    maximum_of_all = max(maximum_of_all, dp[0][i]);
	cout << maximum_of_all << endl;
    return 0;
}
