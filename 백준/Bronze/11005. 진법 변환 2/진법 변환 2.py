N, B = map(int, input().split())

digits = []
while N > 0:
    remainder = N % B
    if remainder < 10:
        digits.append(str(remainder))
    else:
        digits.append(chr(ord('A') + remainder - 10))
    N //= B

result = ''.join(reversed(digits))
print(result)
