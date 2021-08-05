from datetime import datetime as dt
n, m, q = map(int, input().split())

week = []
station = []
store = []
tenant = []
tform = "%Y-%m-%dT%H:%M"

def isOpen(rtime):
    global week, station, store, tenant
    rtime = dt.strptime(rtime, tform)
    for start, end, order in station:
        if rtime >= start and rtime <= end:
            return False if order == "closed" else True
    for start, end, order in store:
        if rtime >= start and rtime <= end:
            return False if order == "closed" else True
    for start, end, order in tenant:
        if rtime >= start and rtime <= end:
            return False if order == "closed" else True
    for day, start, end in week:
        if rtime.strftime("%A") == day:
            start = [int(x) for x in start.split(':')]
            end = [int(x) for x in end.split(':')]
            if rtime.hour > start[0] or (rtime.hour == start[0] and rtime.minute >= start[1]):
                if rtime.hour < end[0]  or (rtime.hour == end[0] and rtime.minute <= end[1]):
                    return True
    return False
            
    
for i in range(n):
    day, start, end = map(str, input().split())
    week.append((day, start, end))
    


for i in range(m):
    dast, start, end, order = map(str, input().split())
    start = dt.strptime(start , tform)
    end = dt.strptime(end , tform)
    if dast == "Station":
        station.append((start, end, order))
    elif dast == "Store":
        store.append((start, end, order))
    elif dast == "Tenant":
        store.append((start, end, order))

for i in range(q):
    rtime = input()
    if isOpen(rtime):
        print("true")
    else:
        print("false")
    