
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] unsortedArray = {10, 6, 8, 5, 7, 3, 4, 42, 1, 500};
        int arrayLength = unsortedArray.length;

        
        MergeSort ms = new MergeSort();
        System.out.println(Arrays.toString(ms.mergeSort(unsortedArray, arrayLength)));
    }

    private int[] mergeSort(int[] unsortedArray, int length) {
        if(length < 2) { return unsortedArray; }

        int middle = length / 2;
        int[] leftArray = new int[middle];
        int[] rightArray= new int[length - middle]; 

        for(int i = 0; i < middle; i++) {
            leftArray[i] = unsortedArray[i];
        }

        for(int i = middle; i < length; i++) {
            rightArray[i - middle] = unsortedArray[i]; 
        }

        // sorts it again
        mergeSort(leftArray, middle);
        mergeSort(rightArray, length - middle);

        // the actual solving
        merge(unsortedArray, leftArray, rightArray, middle, length - middle);
        return unsortedArray;
    }

    private void merge(int[] array, int[] leftArray, int[] rightArray, int left, int right) {
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
