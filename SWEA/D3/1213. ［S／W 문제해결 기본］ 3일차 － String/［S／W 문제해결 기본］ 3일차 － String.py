for _ in range(10):
    test_case = int(input())
    search = input()
    str_ = input()
    count = str_.count(search)

    print("#{} {}" .format(test_case, count))