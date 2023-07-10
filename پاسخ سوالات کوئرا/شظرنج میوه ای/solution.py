def fruits(tuple_of_fruits):
    l = []
    for i in tuple_of_fruits:
        if ((i['shape'] == 'sphere') and (300 <= i['mass'] <= 600) and
                (100 <= i['volume'] <= 500)):
            l.append(i['name'])
    dic = {}
    for items in l:
        dic.update({items: l.count(items)})

    return dic


output = fruits((
    {'name': 'apple', 'shape': 'sphere', 'mass': 350, 'volume': 120},
    {'name': 'mango', 'shape': 'square', 'mass': 150, 'volume': 120},
    {'name': 'lemon', 'shape': 'sphere', 'mass': 300, 'volume': 100},
    {'name': 'apple', 'shape': 'sphere', 'mass': 500, 'volume': 250}))

print(output)
