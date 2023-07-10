li = list(map(int,input().split(' ')))
if sum(li) == 180 and li[1]!=0 and li[2]!=0 and li[0]!=0 :
    print('Yes')
else:
    print('No')