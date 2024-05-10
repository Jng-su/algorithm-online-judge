def postfixFunc(text):
    result = ''
    stack = []

    for i in range(len(text)):
        # 숫자를 만날 경우
        if type(text[i]) == int:
            result += str(text[i])
        # 문자를 만날 경우
        else:
            # 스택이 비어 있을 경우
            if len(stack) == 0:
                stack.append(text[i])

            # 스택에 연산자가 있을 경우
            else:
                # +,- 가 들어올 경우
                if text[i] == '+' or text[i] == '-':
                    while len(stack):
                        result += stack.pop()
                    stack.append(text[i])

                # *,/ 가 들어올 경우
                elif text[i] == '*' or text[i] == '/':
                    if stack[-1] == '*' or stack[-1] == '/':
                        result += stack.pop()
                    stack.append(text[i])

        if i == len(text)-1:
            while len(stack):
                result += stack.pop()

    return result

def calFunc(text):
    stack = []

    for i in range(len(text)):
        # 숫자의 경우 stack 에 저장
        if text[i].isdigit():
            stack.append(text[i])
        # 문자의 경우
        elif not text[i].isdigit():
            if text[i] == '*':
                num1 = int(stack.pop())
                num2 = int(stack.pop())
                num = num2 * num1
                stack.append(num)
            elif text[i] == '+':
                num1 = int(stack.pop())
                num2 = int(stack.pop())
                num = num2 + num1
                stack.append(num)

    return stack[0]

for test_case in range(1, 11):
    length = int(input())
    text = list(input())

    for i in range(len(text)):
        if text[i].isdigit():
            text[i] = int(text[i])
        elif type(text[i]) == str:
            pass

    print("#{} {}" .format(test_case, calFunc(postfixFunc(text))))

