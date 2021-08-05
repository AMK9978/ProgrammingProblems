#include <bits/stdc++.h> 
using namespace std;

void ShiftLeft(string &str, int cnt)
{
	int n = str.length();
	if(n == 0)
		return;
    string newstr = "";
    cnt %= n;
    for(int i=0; i<n; i++)
        newstr += str[(i+cnt+n)%n];
    str = newstr;
}

void ShiftRight(string &str, int cnt)
{
	int n = str.length();
	if(n == 0)
		return;
    string newstr = "";
    cnt %= n;
    for(int i=0; i<n; i++)
        newstr += str[(i-cnt+n)%n];
    str = newstr;
}

void Extend(string &str, int cnt)
{
    for(int i=0; i<cnt; i++)
        str += '*';
}

void Shrink(string &str, int cnt)
{
    if(cnt >= str.length())
        str = "";
    else
        str = str.substr(0, (int)str.length()-cnt);
}

void Reverse(string &str)
{
    reverse(str.begin(), str.end());
}

void Put(string &str, int i, char c)
{
	if(i > str.length()) return;
    str[i-1] = c;
}

void Print(string str)
{
    cout << str << endl;
}

int main()
{
    string order, str="";
    getline(cin, str);
    cin >> order;
    while(order != "EXIT")
    {
        //cout << order << endl;
        //cout << str << endl;
        if(order == "SHIFT-R" || order == "SHIFT-L")
        {
            int cnt;
            cin >> cnt;
            if(order[6] == 'L')
                ShiftLeft(str, cnt);
            else
                ShiftRight(str, cnt);
        }
        else if(order == "EXTEND")
        {
            int cnt;
            cin >> cnt;
            Extend(str, cnt);
        }
        else if(order == "SHRINK")
        {
            int cnt;
            cin >> cnt;
            Shrink(str, cnt);
        }
        else if(order == "REVERSE")
        {
            Reverse(str);
        }
        else if(order == "PUT")
        {
            int i;
            char c;
            cin >> i >> c;
            Put(str, i, c);
        }
        else if(order == "PRINT")
        {
            Print(str);
        }
        cin >> order;
    }
    return 0;
}
