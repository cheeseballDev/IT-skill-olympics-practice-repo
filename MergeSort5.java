import java.util.Arrays;
import java.util.Scanner;

public class MergeSort5 {
    public static void main(String[] args) {
        System.out.print("Please enter the length of array: ");
        Scanner userInput = new Scanner(System.in);
        int[] array = new int[userInput.nextInt()];

        int length = array.length;

        for(int i = 0; i < length; i++) {
            System.out.printf("Please enter the element for position %d: ", i);
            array[i] = userInput.nextInt();
        }
        System.out.println(Arrays.toString(merge(array, length)));

    }

    private static int[] merge(int[] array, int length) {
        if(length < 2) {
            return array;
        }

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

    private static void mergeSort(int[] array, int[] leftArray, int[] rightArray, int left, int right) {
        int i = 0, j = 0, k = 0;

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
