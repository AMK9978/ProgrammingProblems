from collections import Counter


def words_check(text):
    new_list = []
    l = text.split()
    for item in l:
        word = ""
        s = 0
        for i in item:
            if i.isalpha():
                s += 1
                word += i
        if (s / len(item)) > 0.5:
            new_list.append(word.capitalize())
    return Counter(new_list)
