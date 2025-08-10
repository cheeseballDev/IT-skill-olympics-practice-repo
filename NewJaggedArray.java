import java.util.Scanner;

public class NewJaggedArray {

    public static void main(String[] args) {
        NewJaggedArray jg = new NewJaggedArray();    
        jg.solve();
    }

    private void solve() {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter amount of rows: ");
        int rowLength = userInput.nextInt();
        int[][] array = new int[rowLength][];
        int sum = 0;

        for(int i = 0; i < array.length; i++) {
            System.out.printf("Enter the number of columns for row %d: ", (i + 1));
            array[i] = new int[userInput.nextInt()]; 
        }
        
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                System.out.printf("Element at position (%d, %d): ", i, j);
                    int number = userInput.nextInt();
                    array[i][j] = number;
                    sum += number;
            } 
        }

        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            } 
            System.out.println(" ");
        }

        System.out.println("The sum of all elements in the array is: " + sum);
    }
}
