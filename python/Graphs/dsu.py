class disjointSetUnion:
    def __init__(self,n):
        self.parent = list(i for i in range(n))
        self.size= [1 for i in range(n)]
    def find(self,x):
        if self.parent[x]!=x:
            self.parent[x]=self.find(self.parent[x])
        return self.parent[x]
    def union(self,a,b):
        rootA = self.find(a)
        rootB = self.find(b)
        if rootB==rootA:
            return False
        if self.size[rootA]<self.size[rootB]:
            rootB,rootA=rootA,rootB
        self.parent[rootB]=rootA
        self.size[rootA]+=self.size[rootB]
        return True