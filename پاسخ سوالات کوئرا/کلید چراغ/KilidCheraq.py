n = int(input())

count = 0
lamp = []
for i in range(n):
    lamp.append(int(input()))

for i in range(n):
    if i == (n-1):
        break
    elif lamp[i] != lamp[i+1]:
        count+=1

print(count)
