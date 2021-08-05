x = int(input())
list1 = []

for i in range((int)(x)):
    list1.append(input())



variables = {}
outputs = []
line = 0
tekrar = []
for i in range(x):
    tekrar.append(0)
flag = False
while(True):
    aKhat = list1[line].split(" ")
    tekrar[line] += 1
    if(tekrar[line] > 1):
        flag = True
        print(-1)
        break
    if(aKhat[0] == "assign"):
        aval = aKhat[3]
        dovom = aKhat[5]
        if(not aval.isdigit()):
            if(not aval in variables):
                variables[aval] = 0
            aval = variables[aval]
        if(not dovom.isdigit()):
            if(not dovom in variables):
                variables[dovom] = 0
            dovom = variables[dovom]
        variables[aKhat[1]] = (int(aval) + int(dovom)) % 1000000007
    elif(aKhat[0] == "cout"):
        adad = aKhat[1]
        if(not adad.isdigit()):
            if(not adad in variables):
                variables[adad] = 0
            adad = variables[adad]
        outputs.append(adad)

    if(aKhat[0] == "goto"): #elif to if
        line = int(aKhat[1]) -1
    else: #added7
        line += 1 #added
    if(line >= x):#added
        break       #added

if(not flag):
    for i in outputs:
        print(i)

