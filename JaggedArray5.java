
import java.util.Scanner;

public class JaggedArray5 {
    public static void main(String[] args) {
        JaggedArray5 jg = new JaggedArray5();
        jg.solve();
    }

    private void solve() {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Please enter the amount of rows: ");
        int[][] array = new int[userInput.nextInt()][];

        for(int i = 0; i < array.length; i++) {
            System.out.print("Please enter the amount of columns for row: ");
            array[i] = new int[userInput.nextInt()];
        }

        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                System.out.printf("Please enter the value at element (%d, %d): ", i, j);
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
