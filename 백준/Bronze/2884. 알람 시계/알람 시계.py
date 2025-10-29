H, M = map(int, input().split())

MTotal = H * 60 + M - 45
MTotal %= 24 * 60

print(MTotal // 60, MTotal % 60)
