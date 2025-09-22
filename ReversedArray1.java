import java.util.Arrays;
import java.util.Scanner;

public class ReversedArray1 {
    public static void main(String[] args) {
        ReversedArray1 rs = new ReversedArray1();     
        rs.start();
    }

    public void start() {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Input: Size of the array: ");
        int arraySize = userInput.nextInt();

        int array[] = new int[arraySize];
        System.out.print("Elements:\n");
        for (int i = 0; i < arraySize; i++) {
            array[i] = userInput.nextInt();
        }

        System.out.println("Inputted Array: " + Arrays.toString(array));

        int reversedArray [] = new int[arraySize];
        for (int i = arraySize - 1, l = 0; l < arraySize; l++, i--) {
            reversedArray[l] = array[i];
        }

        System.out.println("Revered Array: " + Arrays.toString(reversedArray));
    }
}
