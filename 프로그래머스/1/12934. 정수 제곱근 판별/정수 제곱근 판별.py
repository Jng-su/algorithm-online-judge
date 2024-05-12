from math import sqrt, pow

def solution(n):
    num = sqrt(n)
    
    if num % 1 == 0: return pow(num+1, 2)
    else : return -1