#include <iostream>
using namespace std;

int main()
{
	while(true)
	{
		string div1, div2, div3, div4;
		cin >> div1;
		if(div1[0] == '0')
			break;
		cin >> div2 >> div3 >> div4;
		
		string id = div1 + div2 + div3 + div4;
		
		int oddsSum = 0;
		for(int i=0; i<16; i++)
		{
			if((i+1) % 2 == 1)
			{
				int adad = (id[i] - '0') *2;
				if(adad > 9)
					adad -= 9;
				oddsSum += adad;
			}
			else
			{
				oddsSum += id[i] - '0';
			}
		}
		
		if(oddsSum % 10 == 0)
			cout << "Yes" << endl;
		else
			cout << "No" << endl;
		
	}
}
