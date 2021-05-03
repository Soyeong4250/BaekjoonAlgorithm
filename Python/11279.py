import sys
import heapq

n = int(sys.stdin.readline())
heap = []

for _ in range(n):
    x = int(sys.stdin.readline())
    if x == 0:
        if len(heap) == 0:
            print('0')
        else:
            print(heapq.heappop(heap)[1])
            # heapq.heappop(heap)[0]은 최솟값이고 인덱스1부터는 우선순위와 상관없이 위에 정렬된채로 존재
    else:
        heapq.heappush(heap, (-x, x))
