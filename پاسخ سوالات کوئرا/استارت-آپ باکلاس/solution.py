j, f, m, n = input().split()

l = [int(j), int(f), int(m), int(n)]

countJ = 0
countF = 0
countM = 0
countN = 0

temp = 0


def updatetable(j, f, m, n):
    temp = n
    n = j
    j = f
    f = m
    m = temp
    l = [j, f, m, n]
    return l


while True:
    l[0] = l[0] - 1
    countJ += 1
    l = updatetable(l[0], l[1], l[2], l[3])
    if l[0] == 0 or l[1] == 0 or l[2] == 0 or l[3] == 0:
        break
    l[1] = l[1] - 1
    countF += 1
    l = updatetable(l[0], l[1], l[2], l[3])
    if l[0] == 0 or l[1] == 0 or l[2] == 0 or l[3] == 0:
        break
    l[2] = l[2] - 1
    countM += 1
    l = updatetable(l[0], l[1], l[2], l[3])
    if l[0] == 0 or l[1] == 0 or l[2] == 0 or l[3] == 0:
        break
    l[3] = l[3] - 1
    countN += 1
    l = updatetable(l[0], l[1], l[2], l[3])
    if l[0] == 0 or l[1] == 0 or l[2] == 0 or l[3] == 0:
        break

print(countJ, countF, countM, countN, sep=' ')
