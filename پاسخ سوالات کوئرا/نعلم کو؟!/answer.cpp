#include <iostream>
using namespace std;

int main()
{
    int n, m;
    cin >> n >> m;
    string mazrae[n];

    for(int i=0; i<n; i++)
        cin >> mazrae[i];
    
    int t = 0, nn, mm;
    int circle[8][2] = {{0,0}, {0,1}, {0,2}, {1,2}, {2, 2}, {2, 1}, {2, 0}, {1, 0}};

    for(int i=0; i<n-2; i++)
    {
        for(int j=0; j<m-2; j++)
        {
            int motavali = 0;
            for(int k=0; k<13; k++)
            {
                nn = i + circle[(k%8)][0];
                mm = j + circle[(k%8)][1];
                if(mazrae[nn][mm] == '*')
                {
                    if(++motavali >= 6)
                        t++;
                }
                else
                    motavali = 0;
            }
        }
    }
    
    cout << t << endl;
    system("pause");
    return 0;
}