from collections import defaultdict
n = int(input())
dic = defaultdict(list)
for i in range(0,n):
    line = input()
    dic[line.split(" ")[0]].append((int(line.split(" ")[1])))
for key in dic:
    dic[key] = list(sorted(dic[key]))
q = int(input())
for i in range(0,q):
    line = input()
    name = line.split(" ")[0]
    time = int(line.split(" ")[1])
    print(dic[name][time - 1])