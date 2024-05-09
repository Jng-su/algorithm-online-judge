T = int(input())

for test_case in (range(1, T+1)):
    number = int(input())
    arr = [0,0,0,0,0]

    while number>1 :
        if number%2 == 0 :
            arr[0] += 1
            number = number/2
        elif number%3 == 0 :
            arr[1] += 1
            number = number / 3
        elif number%5 == 0 :
            arr[2] += 1
            number = number / 5
        elif number%7 == 0 :
            arr[3] += 1
            number = number / 7
        elif number%11 == 0 :
            arr[4] += 1
            number = number / 11


    print("#{} {}".format(test_case, " ".join(map(str, arr))))