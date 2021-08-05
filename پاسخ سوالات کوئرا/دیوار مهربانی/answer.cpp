#include <iostream>
using namespace std;

int main()
{
	int n,m;
	cin >> n >> m;
	bool wall[n][m], win;
	string temp;
	for(int i=0; i<n; i++)
	{
		cin >> temp;
		for(int j=0; j<m; j++)
		{
			wall[i][j] = temp[j] == '+';
		}
	}
	
	for(int i=1; i<n; i++)
	{
		win = false;
		for(int j=0; j<n; j++)
		{
			if(wall[i-1][j] && wall[i][j])
			{
				if(!win)
				{
					win = true;
					if(j > 0  && wall[i-1][j-1] != wall[i][j-1])
					{
						cout << "bad wall";
						return 0;
					}
				}
			}
			else
			{
				if(win)
				{
					win = false;
					if(wall[i-1][j] != wall[i][j])
					{
						cout << "bad wall";
						return 0;
					}
				}
			}
		}
	}
	
	cout << "good wall";
}
