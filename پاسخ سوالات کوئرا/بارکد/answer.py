import math

barcode = []

for i in range(9):
    barcode.append(input())

able = True
halat = 1

for i in range(9):
    for j in range(9):
        if abs(i-4) >= 2 and abs(j-4) >= 2:
            if abs(i-4) == 3 and abs(j-4) == 3:
                if barcode[i][j] == '1':
                    able = False
            else:
                if barcode[i][j] == '0':
                    able = False
        elif barcode[i][j] == '2':
                halat *= 2

if able is False:
    print(0)
else:
    print(halat)
