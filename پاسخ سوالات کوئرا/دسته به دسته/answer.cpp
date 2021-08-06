#include <bits/stdc++.h> 
using namespace std;

int team[1<<17]; // 1<<17 is equal to 2^17, maximum of team counts
long long calculate(int l, int r)
{
    if(l == r) // if l==r then this is last team so we should return power of this team
        return team[l];
    int mid = (l+r)/2;
    long long c1 = calculate(l, mid); //maximum possibe of gift if we choose left
    long long c2 = calculate(mid+1, r); //maximum possibe of gift if we choose right
    int max1 = *max_element(team+mid+1, team+r+1); // maximum power of right(for choosing left)
    int max2 = *max_element(team+l, team+mid+1); // maximum power of left(for choosing right)
    
    return max(c1 + max1, c2 + max2); // return maximum of choosing left or right
}

int main()
{
    int n;
    cin >> n;
    for(int i=0; i<(1<<n); i++) // get all teams power values
        cin >> team[i];
    
    cout << calculate(0, (1<<n)-1) << endl;
    return 0;
}
