
def check_registration_rules(**kwargs):
    lst = []
    for key, value in kwargs.items():
        if key != 'quera' and key != 'codecup' and len(key) >= 4 and (
                len(value) >= 6) and not value.isnumeric():
            lst.append(key)
    return lst


# print(check_registration_rules(username='password', sadegh='He3@lsa', quera='kLS45@l$'))
