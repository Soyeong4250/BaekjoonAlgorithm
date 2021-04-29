L, P = map(int, input().split())
num = list(map(int, input().split()))

for i in num:
    result = i - L * P
    print(result, end=' ')
