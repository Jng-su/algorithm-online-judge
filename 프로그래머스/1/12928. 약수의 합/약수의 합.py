def solution(n):
    sum = 0
    
    for num in range(1, n+1):
        if n % num == 0:
            sum += num
        
    return sum