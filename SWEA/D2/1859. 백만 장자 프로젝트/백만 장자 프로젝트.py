T = int(input())

for test_case in range(1, T+1):
    days = int(input())
    price = list(map(int, input().split()))
    sum = 0
    max_price = price[days-1]

    # 10 7 6
    # 1 1 3 1 1 2

    for i in range(days-1, -1, -1):
        # 만약 max_price 가 price[i-1] 보다 작다면 max_price = price[i]
        # 만약 max_price 가 price[i-1] 보다 크다면 그 차를 sum 에 더한다.
        if max_price < price[i]:
            max_price = price[i]
        elif max_price > price[i]:
            sum += max_price - price[i]



    print("#{} {}" .format(test_case, sum))