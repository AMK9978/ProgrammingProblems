#include <bits/stdc++.h>
using namespace std;


int main()
{
    int n, k;
    cin >> n >> k;
    vector<int> pa;
    for(int i=1; i<= 2*n; i++)
        pa.push_back((i+1)/2);
    
    int curr = 0, cu;
    while((int)pa.size() > 1)
    {
        cout << pa[curr] << " ";
        for(int i=1; i<k; i++)
        {
            cu = (curr+i)%(int)pa.size();
            cout << pa[cu] << " ";
        }
        curr = cu;
        cout << endl;
        pa.erase(pa.begin() + curr);
        if(curr == pa.size()) curr = 0, cu = 0;
        if((int)pa.size() == 2 && pa[0] == pa[1])
            break;
    }
    
    cout << "winner:" << pa[0] << endl;
    return 0;
}