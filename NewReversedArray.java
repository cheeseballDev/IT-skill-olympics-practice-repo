import java.util.Scanner;

public class NewReversedArray {
    public static void main(String[] args) {
        NewReversedArray ra = new NewReversedArray();
        ra.solve();
    }

    private void solve() {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Size of the array: ");
        int arraySize = userInput.nextInt();

        int[] array = new int[arraySize];
        int[] reversedArray = new int[arraySize];
        System.out.println("Elements: ");
        for(int i = 0; i < arraySize; i++) {
            array[i] = userInput.nextInt();
        }

        for(int i = arraySize, j = 0; j < arraySize; i--, j++) {
            reversedArray[j] = i;
        }

        System.out.print("Inputted array: ");
        for(int i = 0; i < arraySize; i++) {
            System.out.print(array[i]);
        }

        System.out.print("\nReversed array: ");
        for(int i = 0; i < arraySize; i++) {
            System.out.print(reversedArray[i]);
        }
    }
}
