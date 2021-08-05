import time
from datetime import timedelta, datetime
p, m = map(int, input().split())

karmand = {}

def isOk(start, end):
    for i in range(start, end+1):
        for k in ks:
            if not karmand[k][i]:
                return False
    for i in range(start, end+1):
        for k in ks:
            karmand[k][i] = False
    return True
        
for i in range(p):
    name, e, start, end = map(str, input().split())
    ee = [int(x) for x in e[1:].split(':')]
    start = datetime.strptime(start, '%H:%M')
    end = datetime.strptime(end, '%H:%M')
    td = timedelta(hours = ee[0], minutes = ee[1])
    
    if e[0] == '+':
        start = start - td
        end = end - td
    else:
        start = start + td
        end = end + td
    
    karmand[name] = [False for j in range(1440)]
    for j in range(start.hour*60+start.minute, end.hour*60+end.minute):
        karmand[name][j] = True
    

for i in range(m):
    c, t = map(int, input().split())
    
    ks = input().split()
    
    oked = False
    for j in range(1440-t+1):
        res = isOk(j, j+t-1)
        if res:
            hh, mm  = str(j // 60), str(j % 60)
            if len(hh) == 1:
                hh = '0' + hh
            if len(mm) == 1:
                mm = '0' + mm
            print(hh + ":" + mm)
            oked = True
            break

    
    if not oked:
        print("N/A")
    