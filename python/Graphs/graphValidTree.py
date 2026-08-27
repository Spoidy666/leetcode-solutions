class GraphValidTree:
    def edgeToAdjacencyList(self,edges,n):
        graph = {i: [] for i in range(n)}

        for a, b in edges:
            graph[a].append(b)
            graph[b].append(a)

        return graph
    def dfs(self,node,graph,visited,parent):
        visited.add(node)
        for neighbour in graph[node]:
            if neighbour == parent:
                continue
            if neighbour in visited:
                return False
            if self.dfs(neighbour,graph,visited,node)==False:
                return False
        return True
    def graphValidTree(self,n,edges):
        visited=set()
        graph = self.edgeToAdjacencyList(edges,n)
        return self.dfs(0,graph,visited,-1) and len(visited)==len(graph) 

def main():
    g =GraphValidTree()
    print(g.graphValidTree(5,[
    [0,1],
    [1,2],
    [2,3],
    [1,3],
    [1,4]
]))

if __name__ == '__main__':
    main()