
import java.util.Scanner;

public class JaggedArray6 {
    public static void main(String[] args) {
         JaggedArray6 jg = new JaggedArray6();
         jg.solve();
    }

    private void solve() {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter the amount of rows: ");
        int row = userInput.nextInt();
        int[][] array = new int[row][];

        for(int i = 0; i < row; i++) {
            System.out.printf("Enter the amount of columns for row %d: ", i + 1);
            array[i] = new int[userInput.nextInt()];
        }

        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                System.out.printf("Enter the element at position (%d, %d): ", i, j);
                array[i][j] = userInput.nextInt();
            }
        }

        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }
}
