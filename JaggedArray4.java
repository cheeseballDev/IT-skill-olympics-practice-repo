import java.util.Scanner;

public class JaggedArray4 {
    public static void main(String[] args) {
        JaggedArray4 jg = new JaggedArray4();
        jg.solve();
    }

    private void solve() {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int arrRow = userInput.nextInt();

        int array[][] = new int[arrRow][];
        for(int i = 0; i < array.length; i++) {
            System.out.printf("Enter the number of columns for row %d: ", i + 1);
            array[i]= new int[userInput.nextInt()];
        }

        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                System.err.printf("Enter element at position (%d, %d): ",i,j);
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
