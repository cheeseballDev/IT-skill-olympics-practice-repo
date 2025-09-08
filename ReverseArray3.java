
import java.util.Scanner;

public class ReverseArray3 {
    public static void main(String[] args) {
        ReverseArray3 ra = new ReverseArray3();
        ra.solve();
    }
    
    private void solve() {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int arraySize = userInput.nextInt();

        int[] array = new int[arraySize];

        for(int i = 0; i < arraySize; i++) {
            System.out.printf("Enter the element at position %d: ", i);
            array[i] = userInput.nextInt();
        }

        int[] reversedArray = new int[arraySize];
        for(int i = arraySize - 1, l = 0; i > -1; i--, l++) {
            reversedArray[l] = array[i];
        }

        for(int i = 0; i < arraySize; i++) {
            System.out.print(reversedArray[i] + " ");
        }

    }
}
