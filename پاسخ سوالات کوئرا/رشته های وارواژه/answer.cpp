#include <bits/stdc++.h>
using namespace std;

int good[26] = {0};
int dp[1001][26] = {0};
int k;
bool check(int r)
{
    for(int i=0; i<26; i++)
    {
        if(r == k-1)
        {
            if(dp[r][i] > good[i])
                return false;
        }
        else if(dp[r][i]-dp[r-k][i] > good[i])
            return false;
    }
    return true;
}

int main()
{
    string s, p;
    cin >> s >> p;
    k = p.length();
    
    for(char c : p)
        good[c-'a']++;
    dp[0][(int)(s[0]-'a')]++;
    for(int i=1; i<s.length(); i++)
    {
        for(int j=0; j<26; j++)
            dp[i][j] = dp[i-1][j];
        if(s[i] != '?')
            dp[i][(int)(s[i]-'a')]++;
    }
    int cou = 0;
    for(int i=p.length()-1; i<s.length(); i++)
    {
        if(check(i))
            cou ++;
    }
    
    cout << cou << endl;
    return 0;
}