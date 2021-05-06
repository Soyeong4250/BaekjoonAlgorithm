from collections import deque
import sys

n, m, v = map(int, sys.stdin.readline().split())

graph = [[0]*(n+1) for _ in range(n+1)]
visit = [False for _ in range(n+1)]

for _ in range(m):
    link = list(map(int, sys.stdin.readline().split()))
    graph[link[0]][link[1]] = 1
    graph[link[1]][link[0]] = 1


def dfs(v):
    visit[v] = True
    print(v, end=' ')

    for i in range(1, n+1):
        if not visit[i] and graph[v][i] == 1:
            dfs(i)


def bfs(v):
    visit[v] = True
    #queue = deque([start])

    while queue:
        v = queue.popleft()
        print(v, end=' ')
        for i in range(1, n+1):
            if visit[i] and graph[v][i] == 1:
                queue.append(i)
                visit[i] = True


dfs(v)
visit = [False for _ in range(n+1)]
print()
bfs(v)
