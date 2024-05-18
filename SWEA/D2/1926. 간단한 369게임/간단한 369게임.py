N = int(input())

for i in range(1, N + 1):
    i_str = str(i)
    clap_count = 0

    for char in i_str:
        if char in '369':
            clap_count += 1

    if clap_count > 0:
        print('-' * clap_count, end=' ')
    else:
        print(i, end=' ')