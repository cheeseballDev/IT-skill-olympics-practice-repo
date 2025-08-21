
import java.util.Scanner;

public class JaggedArray3 {
    public static void main(String[] args) {
        JaggedArray3 jg = new JaggedArray3();
        jg.solve();
    }

    private void solve() {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = userInput.nextInt();

        int[][] array = new int[rows][];

        for(int i = 0; i < array.length; i++) {
            System.out.printf("Enter the number of columns for row %d: ", i + 1);
            int column = userInput.nextInt();
            array[i] = new int[column];
        }

        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                System.out.printf("Enter element at position (%d, %d): ", i, j);
                array[i][j] = userInput.nextInt();
            }
        }

        System.out.println("The jagged array is: ");

        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
