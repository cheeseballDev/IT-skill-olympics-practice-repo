import java.util.Scanner;

public class JaggedArray2 {
    public static void main(String[] args) {
        JaggedArray2 jg2 = new JaggedArray2();
        jg2.solve();
    }

    private void solve() {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int arrayLength = userInput.nextInt();

        int[][] array = new int[arrayLength][];


        for (int i = 0; i < array.length; i++) {
            System.out.printf("Enter the number of columns for row (%d): ", i + 1);
            int arrayColumn = userInput.nextInt();
            array[i] = new int[arrayColumn]; 
        }

        for (int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                System.out.printf("Element at position (%d, %d): ", i, j);
                array[i][j] = userInput.nextInt();
            }
        }

        System.out.println("The jagged array is: `");
        for (int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }


        
    }
}
