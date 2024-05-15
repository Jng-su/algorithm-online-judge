T = int(input())

for test_case in range(1, T+1):
    n = 9
    isTrue = [1, 2, 3, 4, 5, 6, 7, 8, 9]
    tmp = []
    matrix = []
    result = 1

    # 입력 및 가로 비교
    for _ in range(n):
        row = list(map(int, input().split()))
        matrix.append(row)
        if sorted(row) != isTrue:
            result = 0
        row = []

    # 세로 비교
    for col in range(n):
        for row in range(n):
            tmp.append(matrix[row][col])
        if sorted(tmp) != isTrue:
            result = 0
        tmp = []

    # 3x3 비교
    for i in range(0, 7, 3):
        for j in range(0, 7, 3):
            for row in range(i, i+3):
                for col in range(i, i+3):
                    tmp.append(matrix[row][col])

            if sorted(tmp) != isTrue:
                result = 0
                break
            tmp = []


    print("#{} {}" .format(test_case, result))