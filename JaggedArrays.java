
import java.util.Scanner;

public class JaggedArrays {
    
    public static void main(String[] args) {
        JaggedArrays jg = new JaggedArrays();
        jg.solve();
    }

    private void solve() {
        Scanner userInput = new Scanner(System.in);
        
        
        System.out.print("Enter the number of rows: ");
        int arrLength = userInput.nextInt();
        int sum = 0;
        int array[][] = new int[arrLength][];

        for(int i = 0; i < arrLength; i++) {
            System.out.printf("Enter the number of columns for row %d: ", (i + 1));
            int arrayColumn = userInput.nextInt();
            array[i] = new int[arrayColumn];
        }

        for(int i = 0; i < array.length; i++) {
            for(int l = 0; l < array[i].length; l++) {
                System.out.printf("Elements at position(%d,%d): ", i, l);
                int numberInput = userInput.nextInt();
                array[i][l] = numberInput;
                sum += numberInput;
            }
        }

        System.out.println("The jagged array is: ");
        for(int i = 0; i < array.length; i++) {
            for(int l = 0; l < array[i].length; l++) {
                System.out.print(array[i][l] + " ");
            }
            System.out.println();
        }
        System.out.println("The sum of all elements in the array is: " + sum);
    }

}