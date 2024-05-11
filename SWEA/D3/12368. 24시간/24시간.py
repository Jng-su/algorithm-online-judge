T = int(input())

for test_case in range(1,1+T):
    time1, time2 = map(int, input().split())
    result = (time1+time2) % 24
    print("#{} {}" .format(test_case, result))