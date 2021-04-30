arr = list(map(int, input().split()))


for num in range(min(arr), 999999):
    cnt = 0
    if num % arr[0] == 0:
        cnt += 1
    if num % arr[1] == 0:
        cnt += 1
    if num % arr[2] == 0:
        cnt += 1
    if cnt == 3:
        print(num)
        break
    if num % arr[3] == 0:
        cnt += 1
        if cnt == 3:
            print(num)
            break
    if num % arr[4] == 0:
        cnt += 1
        if cnt == 3:
            print(num)
            break
