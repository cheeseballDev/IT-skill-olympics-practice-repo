import java.util.Arrays;
import java.util.Scanner;
public class MergeSort6 {
    public static void main(String[] args) {
        System.out.print("Enter amount of elements: ");
        Scanner userInput = new Scanner(System.in);
        int arrSize = userInput.nextInt();
        int[] array = new int[arrSize];
        for(int i = 0; i < arrSize; i++) {
            System.out.printf("Enter element at position %d: ", i);
            array[i] = userInput.nextInt();
        }

        System.out.println(Arrays.toString(mergeSort(array, arrSize)));
    }

    public static int[] mergeSort(int[] array, int length) {
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


        mergeSort(leftArray, middle);
        mergeSort(rightArray, length - middle);

        merge(array, leftArray, rightArray, middle, length - middle);
        
        return array;
    }

    public static void merge(int[] array, int[] leftArray, int[] rightArray, int left, int right) {
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