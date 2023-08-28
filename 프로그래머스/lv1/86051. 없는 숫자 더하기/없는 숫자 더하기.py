def solution(numbers):
    missing_sum = 0

    found = [False] * 10

    for num in numbers:
        found[num] = True

    for i in range(10):
        if not found[i]:
            missing_sum += i

    return missing_sum