students = [True] * 31

for _ in range(28):
    submitted = int(input());
    students[submitted] = False

for i in range(1, 31):
    if students[i]:
        print(i)