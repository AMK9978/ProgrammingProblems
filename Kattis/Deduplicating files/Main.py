n = int(input())
while n != 0:
    dic = {}
    ss = set()
    for i in range(0, n):
        line = input()
        ss.add(line)
        ans = ord(line[0])
        for j in range(1, len(line)):
            ans ^= ord(line[j])
        if ans in dic:
            dic[ans][0] += 1
            if line not in dic[ans][1]:
                dic[ans][1][line] = 1
            else:
                dic[ans][1][line] += 1
        else:
            dic[ans] = [1, {line: 1}]
    collisions = 0
    for v in dic.values():
        if v[0] > 1:
            for v2 in v[1].values():
                collisions += (v[0] - v2) * v2

    print(str(len(ss)) + " " + str(collisions // 2))
    n = int(input())
