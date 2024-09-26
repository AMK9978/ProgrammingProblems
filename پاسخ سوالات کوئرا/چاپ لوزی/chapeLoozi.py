n = int(input())

for i in range(2*n+1):
    if i < (2*n)/2:
        star_counter = 2*i+1
        space_counter = ((2*n+1) - (2*i+1))//2
        row = space_counter*" "+star_counter*"*"+space_counter*" "
        print(row)
    else:
        space_counter = i - int(2*n)//2
        star_counter = (2*n+1) - space_counter*2
        row = space_counter*" "+star_counter*"*"+space_counter*" "
        print(row)
