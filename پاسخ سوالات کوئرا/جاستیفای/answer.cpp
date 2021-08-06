#include <iostream>
#include <cctype>
#include <vector>
#include <cmath>
using namespace std;

int main()
{
    int t, n, w;
    cin >> t;

    for(int i=0; i<t; i++)
    {
        vector<string> satr;
        cin >> n >> w;
        string word[n];
        for(int j=0; j<n; j++)
            cin >> word[j];
        
        bool sentenceFirst = true;
        for(int j=0; j<n; j++)
        {
            word[j][0] = sentenceFirst ? toupper(word[j][0]) : tolower(word[j][0]);
            sentenceFirst = false;
            for(int k=1; k<word[j].length(); k++)
                word[j][k] = tolower(word[j][k]);
            
            char rchar = word[j].back();
            if(rchar == '!' || rchar == '?' || rchar == '.')
                sentenceFirst = true;
        }

        int findex = 0;
        int len = 0;

        for(int j=0; j<n; j++)
        {
            if(len + word[j].length() == w)
            {
                string s = "";
                for(int k=findex; k<j; k++)
                {
                    s += word[k] + " ";
                }
                s += word[j];
                satr.push_back(s);
                findex = j+1;
                len = 0;
            }
            else if(len + word[j].length() < w)
            {
                len += word[j].length() + 1;
            }
            else
            {
                string s = "";
                int m = j - findex;
                len -= m;
                if(m == 1)
                {
                    s = word[j-1];
                    for(int k=0; k<w-len; k++)
                        s += " ";
                    satr.push_back(s);
                    findex = j;
                    len = 0;
                    j--;
                    continue;
                }
                int e = (w - len);
                int r = e % (m-1);
                int fasele = e/(m-1);
                int space[m-1];
                for(int k=0; k<m-1; k++)
                {
                    if(k < floor(r/2.0) || m-1-k <= ceil(r/2.0))
                        space[k] = fasele+1;
                    else
                        space[k] = fasele;
                }

                for(int k=findex; k<j-1; k++)
                {
                    s += word[k];
                    for(int l = 0; l<space[k-findex]; l++)
                        s += " ";
                }
                s += word[j-1];
                satr.push_back(s);
                findex = j;
                len = 0;
                j--;
            }
        }

        string s = "";
        int m = n - findex;
        len -= m;
        if(m == 1)
        {
            s = word[n-1];
            for(int k=0; k<w-len; k++)
                s += " ";
            satr.push_back(s);
        }
        else if(m > 1)
        {
            int e = (w - len);
            int r = e % (m-1);
            int fasele = e/(m-1);
            int space[m-1];
            for(int k=0; k<m-1; k++)
            {
                if(k < floor(r/2.0) || m-1-k <= ceil(r/2.0))
                    space[k] = fasele+1;
                else
                    space[k] = fasele;
            }

            for(int k=findex; k<n-1; k++)
            {
                s += word[k];
                for(int l = 0; l<space[k-findex]; l++)
                    s += " ";
            }
            s += word[n-1];
            satr.push_back(s);
        }

        for(string aSatr : satr)
        {
            cout << "|" << aSatr << "|" << endl;
        }
    }
    return 0;
}