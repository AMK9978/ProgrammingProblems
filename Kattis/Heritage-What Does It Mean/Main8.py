_memo = {}
BIGPRIME = 1000000007


def count_meanings(d, word):
    if word in _memo:
        return _memo[word]
    meaning = d[word] if word in d else 0
    for i in range(1, len(word)):
        f = word[:i]
        l = word[i:]
        if f in d:
            meaning += d[f] * count_meanings(d, l)
    _memo[word] = meaning % BIGPRIME
    return meaning % BIGPRIME


def main():
    N, name = input().split()
    dictionary = {}
    for _ in range(int(N)):
        w, m = input().split()
        dictionary[w] = int(m)

    meanings = count_meanings(dictionary, name)
    print(meanings)


if __name__ == '__main__':
    main()
