import sys
A = int(sys.stdin.readline())
B = int(sys.stdin.readline())

print(A*((B % 100) % 10), A*((B % 100)//10), A*(B//100), A*B, sep='\n')
