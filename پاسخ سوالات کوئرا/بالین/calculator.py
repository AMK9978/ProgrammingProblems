def calculate_floor(string):
    floor = 0
    for i in range(len(string)):    #OR for c in string:
        if string[i] == "U":        #       if c == "U":
            floor +=1
        else:
            floor -=1
    return floor
