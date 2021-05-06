# 위상정렬 알고리즘 :  순서가 정해져 있는 작업을 차례로 수행해야 할 때, 순서를 결정해주는 알고리즘
import sys
import heapq

n, m = list(map(int, sys.stdin.readline().split()))
tree = [[] for _ in range(n+1)]
in_degree = [0 for _ in range(n+1)]
heap = []
result = []
# 문제 순서
for _ in range(m):
    a, b = map(int, sys.stdin.readline().split())  # 세트 문항 입력  #
    tree[a].append(b)
    in_degree[b] += 1  # 각각의 차수 저장

# 진입차수가 0이면 큐에 넣기
for i in range(1, n+1):
    if in_degree[i] == 0:
        heapq.heappush(heap, i)

# 위상정렬
while heap:  # heap이 빌때까지 시행
    data = heapq.heappop(heap)  # 최소힙 사용
    result.append(data)
    for i in tree[data]:
        in_degree[i] -= 1
        if in_degree[i] == 0:
            heapq.heappush(heap, i)

for i in result:
    print(i, end=' ')
