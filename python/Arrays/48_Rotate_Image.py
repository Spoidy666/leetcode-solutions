class RotateImage(object):
    def rotate(self, matrix):
        n = len(matrix)
        for i in range(n):
            for j in range(i+1,n):
                matrix[i][j],matrix[j][i]=matrix[j][i],matrix[i][j]
        for i in range(n):
            for j in range(n//2):
                matrix[i][j],matrix[i][n-j-1]=matrix[i][n-j-1],matrix[i][j]
        return matrix

        
def main():
    matrix = eval(input("Enter the matrix : "))
    obj = RotateImage()
    print(obj.rotate(matrix))

if __name__ == "__main__":
    main()