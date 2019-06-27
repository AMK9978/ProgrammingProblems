n = int(input())
line = input().split(" ")
cnt = [0]*100001
for i in line:
    cnt[int(i)] += 1
f = [0] * 100001
f[1] = cnt[1]
for i in range(2, 100001):
    f[i] = max(f[i - 1], f[i - 2] + i * cnt[i])
print(f[100000])
