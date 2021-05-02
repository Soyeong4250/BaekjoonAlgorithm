import sys

cnt = int(sys.stdin.readline())

for i in range(cnt):
    ps_cnt = 0
    stack = list(sys.stdin.readline())

    for j in range(len(stack)):
        if stack[j] == '(':
            if (ps_cnt < 0):
                break
            else:
                ps_cnt += 1
        elif stack[j] == ')':
            ps_cnt -= 1

    if ps_cnt != 0:
        print("NO")
    else:
        print("YES")
