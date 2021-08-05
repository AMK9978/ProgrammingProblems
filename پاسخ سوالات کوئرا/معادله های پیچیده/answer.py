import math

temp = input()
moadele = input().split("=")

chap = moadele[0]
rast = moadele[1]

if chap == '':
    chap = '0'
if rast == '':
    rast = '0'

if chap.startswith('-') is False:
    chap = '+' + chap

if rast.startswith('-') is False:
    rast = '+' + rast

q = 0 # x
p = 0 # num

jomle = ''
for ch in chap:
    if ch == '+' or ch == '-':
        if jomle != '':
            if jomle.endswith("x"):
                if len(jomle) > 2:
                    q += int(jomle[:-1])
                else:
                    q += int(jomle[:-1] + '1')
            else:
                p -= int(jomle)
        jomle = ch
    else:
        jomle += ch

if jomle != '':
    if jomle.endswith("x"):
        if len(jomle) > 2:
            q += int(jomle[:-1])
        else:
            q += int(jomle[:-1] + '1')
    else:
        p -= int(jomle)
    jomle = ''

for ch in rast:
    if ch == '+' or ch == '-':
        if jomle != '':
            if jomle.endswith("x"):
                if len(jomle) > 2:
                    q -= int(jomle[:-1])
                else:
                    q -= int(jomle[:-1] + '1')
            else:
                p += int(jomle)
        jomle = ch
    else:
        jomle += ch

if jomle != '':
    if jomle.endswith("x"):
        if len(jomle) > 2:
            q -= int(jomle[:-1])
        else:
            q -= int(jomle[:-1] + '1')
    else:
        p += int(jomle)
    jomle = ''

if q == 0:
    print("invalid")
    exit()

if p == 0:
    print("0 1")
    exit()

pz = 1
qz = 1

if q < 0:
    p *= -1
    q *= -1

if p < 0:
    pz = -1
if q < 0:
    qz = -1

p = abs(p)
q = abs(q)

ghp = []
ghq = []

for i in range(1, int(math.sqrt(p))+1):
    if p % i == 0:
        ghp.append(i)
        ghp.append(int(p/i))

for i in range(1, int(math.sqrt(q))+1):
    if q % i == 0:
        ghq.append(i)
        ghq.append(int(q/i))

maxi = 1
for g in ghp:
    if g in ghq and g > maxi:
        maxi = g

p = int(p/maxi)
q = int(q/maxi)

print(str(p * pz) + " " + str(q * qz))