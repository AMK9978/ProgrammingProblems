a = int(input())
b = int(input())

def isPrime(n):
    if n>1:
        for i in range(2,n):
            if (n%i) == 0:
                return False
        return True
    else:
        return False


for i in range(a,b+1):
    if isPrime(i):
        print(i)



