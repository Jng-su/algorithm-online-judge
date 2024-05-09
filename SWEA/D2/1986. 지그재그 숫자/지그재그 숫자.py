T = int(input())
for test_case in range(1, T+1):
    num = int(input())
    result = 0

    for n in range(1, num+1):
        if n % 2 == 0:
            result -= n
        else:
            result += n

    print("#{} {}" .format(test_case, result))