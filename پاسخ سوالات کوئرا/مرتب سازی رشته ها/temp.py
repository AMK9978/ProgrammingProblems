# -*- coding: utf-8 -*-
"""
Spyder Editor

This is a temporary script file.
"""

p = input().split()[:-1]
n = len(p)
res = []
for i in range(n):
    k = min(x for x in range(n) if p[x] != 'ISSA')
    for j in range(0,n):
        if p[j]=='ISSA':
            continue
        if p[k][0:1].lower() > p[j][0:1].lower():
            k = j
        elif p[k][0:1].lower() == p[j][0:1].lower():
            if p[k][0:1] > p[j][0:1]:
                k = j
            elif p[k][0:1] == p[j][0:1]:
                if p[k][0:2].lower() > p[j][0:2].lower():
                    k = j
                elif p[k][0:2].lower() == p[j][0:2].lower():
                    if p[k][0:2] > p[j][0:2]:
                        k = j
    res.append(p[k])
    p[k]='ISSA'
print(' '.join(res))
