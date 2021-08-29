#include "iostream"
 
using namespace std;
 
int main()
{
 
 char ch[6];
 int r = 0;
 int g = 0;
 int y = 0;
 
 cin >> ch;
 
 for(int i=0; i<=4;i++)
 {
 if((int) ch[i] == (int) 'R' || (int) ch[i] == (int) 'r')
 r++;
 else if((int) ch[i] == (int) 'G' || (int) ch[i] == (int) 'g')
 g++;
 else if((int) ch[i] == (int) 'Y' || (int) ch[i] == (int) 'y')
 y++;
 }
 
 if( (r == 5 || y == 5) || ( r >= 3 ) || ( r >=2 && y >= 2) || (r == 1 && y == 4) )
 cout << "nakhor lite" << endl;
 else
 cout << "rahat baash" << endl;
 
 return 0;
}