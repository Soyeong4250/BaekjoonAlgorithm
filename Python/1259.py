for i in range(99999):
    arr = list(input())
    if arr == ['0']:
        break

    arr2 = []

    N = len(arr)
    for n in range(N-1, -1, -1):
        arr2.append(arr[n])
    if arr == arr2:
        print('yes')
    else:
        print('no')
