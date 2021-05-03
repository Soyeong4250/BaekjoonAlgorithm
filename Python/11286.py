import sys
import heapq

n = int(sys.stdin.readline())
heap = []

for _ in range(n):
    x = int(sys.stdin.readline())
    sorted_heap = []
    if x == 0:
        if len(heap) != 0:
            print(heapq.heappop(heap)[1])
        else:
            print('0')
    else:
        heapq.heappush(heap, (abs(x), x))
