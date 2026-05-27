import java.util.Scanner;
import java.util.HashSet;
class Sudoku {
    public boolean isValidSudoku(char[][] board) {

    HashSet<Character> set1 = new HashSet<>();
    HashSet<Character> set2 = new HashSet<>();
    for (int i = 0; i < 9; i++) {
        set1.clear();
        set2.clear();
        for (int j = 0; j < 9; j++) {
            char row = board[i][j];
            char col = board[j][i];
            if (row != '.') {
                if (set1.contains(row)) {
                    return false;
                }
                set1.add(row);
            }
            if (col != '.') {
                if (set2.contains(col)) {
                    return false;
                }
                set2.add(col);
            }
        }
    }

    int[][] start = {
        {0,0}, {0,3}, {0,6},
        {3,0}, {3,3}, {3,6},
        {6,0}, {6,3}, {6,6}
    };

    for (int[] box : start) {
        HashSet<Character> set = new HashSet<>();
        int rowStart = box[0];
        int colStart = box[1];
        for (int i = rowStart; i < rowStart + 3; i++) {
            for (int j = colStart; j < colStart + 3; j++) {
                char val = board[i][j];
                if (val != '.') {
                    if (set.contains(val)) {
                        return false;
                    }
                    set.add(val);
                }
            }
        }
    }
    return true;
}
    public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);

    char[][] board = new char[9][9];

    System.out.println("Enter the Sudoku board row by row");
    System.out.println("Use . for empty cells");
    System.out.println("Example row: 53..7....");

    for (int i = 0; i < 9; i++) {

        String row = sc.nextLine();

        while (row.length() != 9) {
            System.out.println("Row must contain exactly 9 characters");
            row = sc.nextLine();
        }

        for (int j = 0; j < 9; j++) {
            board[i][j] = row.charAt(j);
        }
    }

    Sudoku obj = new Sudoku();

    if (obj.isValidSudoku(board)) {
        System.out.println("Valid Sudoku");
    } else {
        System.out.println("Invalid Sudoku");
    }

    sc.close();
}
}