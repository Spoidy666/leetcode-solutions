class Sudoku:
    def isValidSudoku(self, board):
        for i in range(9):
            set1=set()
            set2=set()
            for j in range(9):
                row=board[i][j]
                col=board[j][i]
                if row in set1 or col in set2:
                    return False
                if col!=".":
                    set2.add(col)
                if row!=".":
                    set1.add(row)
        start = [
    [0,0], [0,3], [0,6],
    [3,0], [3,3], [3,6],
    [6,0], [6,3], [6,6]
]
        for i,j in start:
            sett=set()
            for rows in range(i,i+3):
                for cols in range(j,j+3):
                    val = board[rows][cols]
                    if val in sett:
                        return False
                    elif val !=".":
                        sett.add(val)
        return True

def main():
    board = []

    print("Enter the Sudoku board row by row")
    print("Use . for empty cells")
    print("Example row: 53..7....")

    for i in range(9):
        row = input(f"Enter row {i + 1}: ")

        while len(row) != 9:
            print("Row must contain exactly 9 characters")
            row = input(f"Enter row {i + 1}: ")

        board.append(list(row))

    sol = Sudoku()

    if sol.isValidSudoku(board):
        print("Valid Sudoku")
    else:
        print("Invalid Sudoku")


if __name__ == "__main__":
    main()