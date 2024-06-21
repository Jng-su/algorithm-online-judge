div_result = set()
for _ in range(10):
    num = int(input())
    div_result.add(num % 42)

print(len(div_result))
