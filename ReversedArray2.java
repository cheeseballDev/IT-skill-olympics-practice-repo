import java.util.Scanner;

public class ReversedArray2 {
    public static void main(String[] args) {
        ReversedArray2 fb2 = new ReversedArray2();
        fb2.solve();
    }

    private void solve() {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Size of the array: ");
        int arraySize = userInput.nextInt();

        int[] array = new int[arraySize];
        for(int i = 0; i < arraySize; i++) {
            array[i] = userInput.nextInt();
        }


        int[] reversedArray = new int[arraySize];
        for(int i = arraySize - 1, j = 0; i >= 0; i--, j++) { 
            reversedArray[j] = array[i];
        }

        System.out.println("Inputted array:");
        for(int i = 0; i < arraySize; i++) {
            System.out.print(array[i]);
        }

        System.out.println("Reversed array:");
        for(int i = 0; i < arraySize; i++) {
            System.out.print(reversedArray[i]);
        }
        
    }
}
