def solution(a, b):
    min_v = min(a,b);
    max_v = max(a,b);
    sum = 0;
    for i in range(min_v,max_v+1):
        sum+=i;
    return sum;