n = int(input())

for i in range(1,n+1):
    if i == 1 or i == n:
        for i in range(1,n+1):
            print('*',end='')
        print()
    else:
        for i in range(1,n+1,n-2):
            print('*',end='')
            for j in range(1,(n+1)-2):
                print(' ',end='')
        print()
