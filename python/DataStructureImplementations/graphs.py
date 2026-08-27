from collections import deque
def edgeToAdjacencyList(edges):
    graph={}
    for a,b in edges:
        if a not in graph:
            graph[a]=[]
        if b not in graph:
            graph[b]=[]
        graph[a].append(b)
        graph[b].append(a)

def dfs(node, grpah, visited):
    if node in visited:
        return 
    visited.add(node)
    for neighbour in graph[node]:
        dfs(neighbour,graph,visited)
def bfs(start,graph):
    visited=set()
    q= deque()
    q.append(start)
    visited.add(start)
    while q:
        node = q.popleft()
        for neighbour in graph(node):
            if neighbour not in visted:
                visited.add(neighbour)
                q.append(neighbour)
