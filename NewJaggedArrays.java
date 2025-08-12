
import java.util.Scanner;

public class NewJaggedArrays {
    public static void main(String[] args) {
        NewJaggedArrays nj = new NewJaggedArrays();
        nj.solve();
    }

    private void solve() {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = userInput.nextInt();
        int array[][] = new int[rows][];
        for(int i = 0; i < rows; i++) {
            System.out.printf("Enter the number of columns for row %d:", i + 1);
            array[i] = new int[userInput.nextInt()];
        }

        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                System.out.printf("Element at position (%d, %d): ", i, j);
                array[i][j] = userInput.nextInt();
            }
        }

        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
