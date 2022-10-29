import sys
import heapq
n = int(sys.stdin.readline())
heap = []

for i in range(n):
    x = int(sys.stdin.readline())
    if x != 0:
        heapq.heappush(heap, x)
    else:
        if len(heap) != 0:
            print(heapq.heappop(heap))
        else:
            print('0')
