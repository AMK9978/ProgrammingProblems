n = int(input())

rows, cols = (n,n)

col = [[0 for i in range(cols)] for j in range(rows)]

def khayam(i,j):
    if j == 0 or i == j :
        col[i][j] = 1
    else:
        col[i][j] = (khayam(i-1,j) + khayam(i-1,j-1))

    return col[i][j]

for i in range(n):
    for j in range(i+1):
        print(khayam(i,j),end=' ')
    print()
