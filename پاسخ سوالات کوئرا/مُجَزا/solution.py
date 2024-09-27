def separator(ls):
    odd_l = []
    even_l = []
    for i in ls:
        if i % 2 == 0:
            even_l.append(i)
        else:
            odd_l.append(i)

    t = (even_l, odd_l)
    return t