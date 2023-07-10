n , k = input().split()
n = int(n)
k = int(k)
sum = 0
for i in range (n):
    c = int(input())
    sum += c
if k <= sum:
    print("YES")
else:
    print("NO")
    
