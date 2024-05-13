for test_case in range(1, 11):
    n = int(input())
    arr = list(map(int, input().split()))
    count = 0
    
    for node in range(2, n-2):
        # 가장 큰 값 찾기
        if arr[node] > arr[node-2] and arr[node] > arr[node-1] and arr[node] > arr[node+1] and arr[node] > arr[node+2]:
            max_building = arr[node]

            # 왼쪽 높은 값
            left_max = max(arr[node-2], arr[node-1])
            # 오른쪽 높은 값
            right_max = max(arr[node+1], arr[node+2])

            side_max = max(left_max, right_max)
            count += max_building - side_max

    print("#{} {}" .format(test_case, count))