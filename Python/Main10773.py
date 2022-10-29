import sys

cnt = int(sys.stdin.readline())
stack = []
result = 0

for i in range(cnt):
    x = int(sys.stdin.readline())
    if x == 0:
        stack.pop()
    else:
        stack.append(x)

for j in range(len(stack)):
    result += stack[j]
print(result)
