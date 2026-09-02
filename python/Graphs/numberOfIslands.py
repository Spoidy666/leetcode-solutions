class Solution:
    def __init__(self,m,n):
        self.parent = [i for i in range(m*n)]
        self.size = [1 for i in range(m*n)]

    def find(self,a):
        if self.parent[a]!=a:
            self.parent[a]=self.find(self.parent[a])
        return self.parent[a]
    def union(self,a,b):
        rootA = self.find(a)
        rootB = self.find(b)
        if rootA == rootB:
            return False
        if self.size[rootA]<self.size[rootB]:
            rootA,rootB = rootB,rootA
        self.parent[rootB]=rootA
        self.size[rootA]+=self.size[rootB]
        return True        
    def numIslands2(self, m: int, n: int, positions: List[List[int]]) -> List[int]:
        count = 0
        result = []
        inLand=set()
        def toIndex(r,c):
            return r*n+c
        for row, column in positions:
            if toIndex(row,column) in inLand:
                result.append(count)
                continue
            inLand.add(toIndex(row,column))
            count+=1
            distance = [(0,1),(1,0),(0,-1),(-1,0)]
            for r,c in distance:
                if row+r<0 or row+r>=m or column+c<0 or column+c>=n:
                    continue
                if toIndex(row+r,column+c) not in inLand:
                    continue
                merged= self.union(toIndex(row+r,column+c),toIndex(row,column))
                if merged:
                    count-=1
            result.append(count)
        return result

m = 4
n = 5

positions = [
    [0, 0],
    [0, 1],
    [1, 1],
    [3, 4],
    [2, 4],
    [1, 4],
    [2, 3],
    [2, 2]
]
s = Solution(m,n)
print(s.numIslands2(m,n,positions))