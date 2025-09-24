import java.util.Scanner;

public class JaggedArray8 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("Enter number of rows: ");
        int arrayRow = userInput.nextInt();
        
        int[][] array = new int[arrayRow][];

        for(int i = 0; i < arrayRow; i++) {
            System.out.printf("Enter number of columns for row %d: ", i);
            array[i] = new int[userInput.nextInt()];
        }

        for(int i = 0; i < arrayRow; i++) {
            for(int j = 0; j < array[i].length; j++) {
                System.out.printf("Enter element at position (%d, %d): ", i, j);
                array[i][j] = userInput.nextInt();
            }
        }

        
        for(int i = 0; i < arrayRow; i++) {
            for(int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println(" ");
        }
        
    }
}
