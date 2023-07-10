m , h = input().split()
m = int(m)
h = int(h)

if m == h:
    print("Saal Noo Mobarak!")
elif m < h:
    for i in range(h-m):
        print("R",end='')
else:
    for i in range(m-h):
        print("L",end='')
