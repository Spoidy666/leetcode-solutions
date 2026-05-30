import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
class RotateImage{
     public void rotate(int[][] matrix) {
        int temp;
        int n = matrix.length;
        for(int i = 0 ; i < n ; i++){
            for(int j = i+1 ; j <n ; j++){
                temp = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int i = 0 ; i < n ; i++){
            for (int j =0;j < n/2 ;j++){
                temp= matrix[i][j];
                matrix[i][j]=matrix[i][n-j-1];
                matrix[i][n-j-1]=temp;
            }
        }
        for(int i = 0; i < matrix.length; i++) {
    System.out.println(Arrays.toString(matrix[i]));
}
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int n = sc.nextInt();
        System.out.println("Enter elements one by one : ");
        int[][] matrix = new int[n][n];
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j <n ; j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        RotateImage obj = new RotateImage();
        obj.rotate(matrix);
    }
}