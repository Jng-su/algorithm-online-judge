T = int(input())

for test_case in range(1, T+1):
    num = int(input())
    arr = [False] * 10
    k = num

    while 1:

        for i in range(0, len(str(num))):
            arr[int(str(num)[i])] = True

        if all(arr):
            print("#{} {}" .format(test_case, num))
            break
        else:
            num += k