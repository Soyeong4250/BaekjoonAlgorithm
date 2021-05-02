import sys

cnt = int(sys.stdin.readline())
stack = list()

for i in range(cnt):
    command = sys.stdin.readline().split()
    # push
    if command[0] == 'push':
        stack.append(int(command[1]))
    # pop
    elif command[0] == 'pop':
        if len(stack) == 0:
            print('-1')
        else:
            print(stack[-1])
            stack.pop(-1)
    # size
    elif command[0] == 'size':
        print(len(stack))
    # empty
    elif command[0] == 'empty':
        if len(stack) == 0:
            print('1')
        else:
            print('0')
    # top
    elif command[0] == 'top':
        if len(stack) == 0:
            print('-1')
        else:
            print(stack[-1])
