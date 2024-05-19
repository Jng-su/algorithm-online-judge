T = 10

for test_case in range(1, T+1):
    inputs = input().split()
    str_length = int(inputs[0])
    num_str = inputs[1]

    stack = []

    for char in num_str:
        if stack and stack[-1] == char:
            stack.pop()
        else:
            stack.append(char)

    result = "".join(stack)

    print("#{} {}" .format(test_case, result))

