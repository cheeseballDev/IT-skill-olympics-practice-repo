import java.util.Arrays;
import java.util.Scanner;

public class MergeSort3 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter amount of numbers to be sorted: ");
        int numberToSort = userInput.nextInt();

        int[] unsortedArray = new int[numberToSort];

        for(int i = 0; i < numberToSort; i++) {
            System.out.printf("Enter number at element (%d): ", i + 1);
            unsortedArray[i] = userInput.nextInt();
        }

        MergeSort3 ms = new MergeSort3();
        System.out.println(Arrays.toString(ms.merge(unsortedArray, unsortedArray.length)));

    }

    private int[] merge(int[] array, int length) {
        if(length < 2) { return array; }

        int middle = length / 2;

        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];

        for(int i = 0; i < middle; i++) {
            leftArray[i] = array[i];
        }

        for(int i = middle; i < length; i++) {
            rightArray[i - middle] = array[i]; 
        }

        merge(leftArray, middle);
        merge(rightArray, length - middle);

        mergeSort(array, leftArray, rightArray, middle, length - middle);

        return array;
    } 

    private void mergeSort(int[] array, int[] leftArray, int[] rightArray, int left, int right) {
        int k = 0, i = 0, j =0;
        
        while(i < left && j < right) {
            if(leftArray[i] <= rightArray[j]) {
                array[k++] = leftArray[i++];
            } else {
                array[k++] = rightArray[j++];
            }
        }

        while(i < left) {
            array[k++] = leftArray[i++];
        }

        while(j < right) {
            array[k++] = rightArray[j++];
        }

    } 
}