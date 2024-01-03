def solution(a, b, n):
    result = 0
    while (n >= a):
        remain_bottle = n % a
        n = (n//a) * b
        result += n
        n += remain_bottle
    return result