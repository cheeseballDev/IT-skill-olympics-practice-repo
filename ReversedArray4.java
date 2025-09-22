import java.util.Scanner;

public class ReversedArray4 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter amount of elements: ");
        int arrayLength = userInput.nextInt();

        int[] array = new int[arrayLength];
        for(int i = 0; i < arrayLength; i++) {
            System.out.printf("Enter element at position %d: ", i);
            array[i] = userInput.nextInt();
        }

        int[] reversedArray = new int[arrayLength];
        for(int i = arrayLength - 1, j = 0; i > -1; i--, j++) {
            reversedArray[j] = array[i];
        }

        for(int i = 0; i < arrayLength; i++) {
            System.out.print(reversedArray[i] + " ");
        }



    }
}
