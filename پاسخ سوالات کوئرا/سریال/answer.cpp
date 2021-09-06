#include <iostream>
#include <string>

using namespace std;
int main() {
    int n,k;
    cin >> n >>k;
    int* roz;
    roz=new int[n];
    for(int i=0;i<n;i++)
        cin >> roz[i];
    int mota=0;
    int mota2=0;
    for(int i=1;i<n;i++)
    {
        if(roz[i]-roz[i-1]==1)
            mota++;
        else
        {
            if(mota>mota2)
            mota2=mota;
            mota=0;
        }

    }
    if(k<=n-mota2-1)
        cout << mota2+k+1;
    else
        cout << n;

    return 0;
}