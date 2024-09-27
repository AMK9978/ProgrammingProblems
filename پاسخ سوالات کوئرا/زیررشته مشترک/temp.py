# -*- coding: utf-8 -*-
"""
Spyder Editor

This is a temporary script file.
"""

n = int(input())
a = []
minSize=10000
for i in range(n):
    s = input()
    a.append(s)
    if len(s)<minSize:
        minSize = len(s)


def find():
    for l in range(minSize,0,-1):
        for i in range(0,len(a[0])-l+1):
            s = a[0][i:i+l]
            s2 = s[::-1]
            found = True
            for j in range(1, n):
                if s not in a[j] and s2 not in a[j]:
                    found = False
            if found:
                print(s)
                return


find()
        
