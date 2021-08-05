#include <iostream>
#include <vector>
using namespace std;

int main()
{
	int n;
	cin >> n;
	vector<int> don;
	don.resize(n);
	for(int i=0; i<n; i++)
		cin >> don[i];
		

	bool soodi = false;
	bool nozoli = true;
	int tol = 1;
	for(int j=0; j<n-1; j++)
	{
		if(don[j] < don[j+1])
		{
			if(soodi)
			{
				continue;
			}
			else
			{
				soodi = true;
				nozoli = false;
				tol ++;
			}
			
		}
		else
		{
			if(nozoli)
			{
				continue;
			}
			else
			{
				soodi = false;
				nozoli = true;
				tol ++;
			}
		}
	}
	

	cout << tol;
		
}
