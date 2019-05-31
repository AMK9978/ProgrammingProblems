from sys import stdin
dic = {}
for line in stdin:
    command = line.split(" ")[0]
    if command == 'def':
        dic[line.split(" ")[1]] = int(line.split(" ")[2])
    elif command == 'calc':
        flag = True
        arr = line.split(" ")
        first_word = arr[0]
        answer = line[len(first_word) + 1: len(line) - 1]
        ans = 0
        operator = '+'
        for i in range(1,len(arr)):
            if i % 2 != 0:
                if arr[i] not in dic and arr[i] != '=':
                    flag = False
                else:
                    if operator == '+':
                        ans += dic[arr[i]]
                    else:
                        ans -= dic[arr[i]]
            else:
                operator = arr[i]
        if not flag:
            print("%s %s" %(answer,'unknown'))
        else:
            FF = False
            for key,value in dic.items():
                if  value == ans:
                    print("%s %s" %(answer, key))
                    FF = True
                    break
            if not FF:
                print("%s %s" %(answer,'unknown'))
    else:
        dic.clear()