sum = 0

for i in list(map(int, input().split())):
    sum += i**2

print(sum % 10)
