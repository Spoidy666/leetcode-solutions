import heapq
class GraphLearning:
    def edgeToGraph(self,edges,n):
        graph = {i: [] for i in range(n)}
        for f, w, t in edges:
            graph[f].append((w, t))
        return graph
    def dijkstra(self,graph, node):
        dist = {i: float('inf') for i in graph}
        dist[node] = 0
        heap = []
        heapq.heappush(heap,[0,node])
        while heap:
            distance, node = heapq.heappop(heap)
            if distance>dist[node]:
                continue
            for neighbour, weight in graph[node]:
                current_distance = dist[node]+ weight
                if current_distance<dist[neighbour]:
                    dist[neighbour]=current_distance
                    heapq.heappush(heap,[current_distance,neighbour])
        print(dist)
        



def main():
    edges = [
    [0, 1, 4],
    [0, 2, 1],
    [2, 1, 2],
    [1, 3, 1],
    [2, 3, 5]
    ]
    n = 5
    g = GraphLearning()
    graph = g.edgeToGraph(edges,n)
    g.dijkstra(graph,0)

if __name__ == "__main__":
    main()
