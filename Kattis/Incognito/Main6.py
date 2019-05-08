t = int(input())
for i in range(0, t):
    n = int(input())
    dic = {}
    for j in range(0, n):
        line = input()
        s1 = line.split(" ")[0]
        s2 = line.split(" ")[1]
        if s2 in dic:
            dic[s2] += 1
        else:
            dic[s2] = 2
    ans = 1
    for k in dic:
        ans *= dic[k]
    print(ans - 1)
