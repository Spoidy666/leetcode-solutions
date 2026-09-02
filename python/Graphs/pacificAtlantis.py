class Solution:
    def pacificAtlantic(self, heights: List[List[int]]) -> List[List[int]]:
        output = []
        rows = len(heights)
        columns = len(heights[0])
        def dfs(row,column,sett):
            if (row, column) in sett:
                return
            sett.add((row,column))
            for i,j in [[1,0],[-1,0],[0,1],[0,-1]]:
                a = i + row
                b = j + column
                if a>= rows or a<0 or b>=columns or b< 0:
                    continue
                if heights[row][column]<=heights[a][b]:
                    dfs(a,b,sett)

        pacific = set()
        atlantic = set()
        for i in range(rows):
            dfs(i,0,pacific)
            dfs(i, columns - 1, atlantic)
        for j in range(columns):
            dfs(0,j,pacific)
            dfs(rows-1,j,atlantic)
        for cell in pacific & atlantic:
            output.append(list(cell))

        return output
  

c = Solution()
print(c.pacificAtlantic([[1,2,2,3,5],[3,2,3,4,4],[2,4,5,3,1],[6,7,1,4,5],[5,1,1,2,4]]))

        