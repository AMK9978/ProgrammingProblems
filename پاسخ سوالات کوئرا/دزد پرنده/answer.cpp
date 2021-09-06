#include <iostream>
#include <algorithm>
#include <math.h>
using namespace std;

int main()
{
	int t;
	cin >> t;
	string pasokh[t];
	for(int i=0; i<t; i++)
	{
		int n, k;
		cin >> n >> k;
		
		int polis[k][2];
		for(int j=0; j<k; j++)
		{
			cin >> polis[j][0];
			cin >> polis[j][1];
		}
		
		if(k <= 1 || n == 3)
		{
			pasokh[i] = "Yes";
			continue;
		}
		
		qsort(polis, k, sizeof(*polis),
        [](const void *arg1, const void *arg2)->int
        {
            int const *lhs = static_cast<int const*>(arg1);
            int const *rhs = static_cast<int const*>(arg2);
            return (lhs[0] < rhs[0]) ? -1
                :  ((rhs[0] < lhs[0]) ? 1
                :  (lhs[1] < rhs[1] ? -1
                :  ((rhs[1] < lhs[1] ? 1 : 0))));
        });
		
        for(int j=1; j<k; j++)
		{
			if(abs(polis[j-1][0] - polis[j][0]) <= 1)
			{
				if(polis[j-1][1] != polis[j][1])
				{
					pasokh[i] = "No";
					break;
				}
			}
			
			if(j == k-1)
				pasokh[i] = "Yes";
		}
	}
	for(int i=0; i<t; i++)
	{
		cout << pasokh[i] << endl;
	}
	
	return 0;
}
