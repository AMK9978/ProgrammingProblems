# -*- coding: utf-8 -*-
"""
Spyder Editor

This is a temporary script file.
"""

n, k = [int(x) for x in input().split()]
days = [int(x) for x in input().split()]
selected_max_len = 1
max_len = 1
counter = 0
while counter < n-1:
    if days[counter+1] == days[counter] + 1:
        max_len += 1
    else:
        selected_max_len = max_len if max_len > selected_max_len else selected_max_len
        max_len = 1
    counter += 1
print(selected_max_len + k if selected_max_len + k < n else n)
