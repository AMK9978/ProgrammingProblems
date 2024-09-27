def calculator(n, m, li):
    overall_l = []
    number_of_sub_lists = int((n / m) + (n % m))
    gp = 0
    counter = 0

    for a in range(number_of_sub_lists):  # Create m sub list in overall list
        lst = []
        overall_l.append(lst)

    while counter + m <= n:  # Filling sub lists
        for j in range(counter, counter + m):
            overall_l[gp].append(li[j])
        gp += 1
        counter += m

    for k in range(counter, n):  # Adding remaining of original list to overall list
        overall_l[gp].append(li[k])

    sum_of_overall_l = []
    for item in range(len(overall_l)):  # Calculate sum of each list and add to new list
        sum_of_overall_l.append(sum(overall_l[item]))

    temp = sum_of_overall_l[0]
    step = 1
    for z in range(len(sum_of_overall_l)):
        if (step + 1 <= len(sum_of_overall_l)) and (step % 2 != 0):
            temp -= sum_of_overall_l[step]
            step += 1
        elif (step + 1 <= len(sum_of_overall_l)) and (step % 2 == 0):
            temp += sum_of_overall_l[step]
            step += 1
    return temp


# print(calculator(8, 3, [1, 2, 3, 4, 5, 6, 7, 8]))
