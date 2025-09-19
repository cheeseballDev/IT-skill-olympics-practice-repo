import java.util.Scanner;

public class AddMatrix2 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int[][] matrix1 = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        int[][] matrix2 = {
            {10,10,10},
            {10,10,10},
            {10,10,10}
        };

        for(int i = 0; i < matrix1.length; i++) {
            for(int j = 0; j < matrix1[i].length; j++) {
                matrix1[i][j] += matrix2[i][j];
            }
        }

        for(int i = 0; i < matrix1.length; i++) {
            for(int j = 0; j < matrix1[i].length; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println("");
        }

    } 
}
