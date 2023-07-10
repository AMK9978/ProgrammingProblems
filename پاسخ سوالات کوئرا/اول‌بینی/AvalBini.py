a = int(input())
b = int(input())

result=[]

def isPrime(n):
    if n>1:
        for i in range(2,n):
            if (n%i) == 0:
                return False
        return True
    else:
        return False


for i in range(a+1,b):
    if isPrime(i):
        result.append(str(i))

print(",".join(result))
