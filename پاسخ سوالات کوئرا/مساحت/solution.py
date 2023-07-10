import math


def get_func(ls):
    list = []
    for item in ls:
        if item == "square":
            def f(x):
                return x * x

            list.append(f)
        elif item == "circle":
            def f(x):
                return math.pi * x * x

            list.append(f)
        elif item == "rectangle":
            def f(x, y):
                return x * y

            list.append(f)
        elif item == "triangle":
            def f(x, y):
                return x * y / 2

            list.append(f)

    return list
