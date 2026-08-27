class ConnectedComponents:
    def edgeToAdjacencyList(self,edges):
        graph ={}
        for a,b in edges:
            if a not in graph:
                graph[a]=[]
            if b not in graph:
                graph[b]=[]
            graph[a].append(b)
            graph[b].append(a)
        return graph
    def bfs(self,start,graph,visited):
        from collections import deque
        q=deque()
        visited.add(start)
        q.append(start)
        while q:
            node = q.popleft()
            for i in graph[node]:
                if i not in visited:
                    visited.add(i)
                    q.append(i)

    def countComponents(self, n: int, edges: List[List[int]]) -> int:
        cc=0
        graph = self.edgeToAdjacencyList(edges)
        for i in range(n):
            if i not in graph:
                graph[i]=[]
        
        visited=set()
        for i in range(n):
            if i not in visited:
                cc+=1
                self.bfs(i,graph,visited)
        return cc

def main():
    c = ConnectedComponents()
    print(c.countComponents(5,[[0,1], [1,2], [2,3], [3,4]]))

if __name__ == '__main__':
    main()


