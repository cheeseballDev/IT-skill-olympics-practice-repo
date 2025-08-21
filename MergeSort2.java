import java.util.Arrays;

public class MergeSort2 {
    public static void main(String[] args) {
        int[] unsortedArray = {10, 400, 9, 25, 2, 50, 7, 200, 22, 99};
        int arrayLength = unsortedArray.length;
        MergeSort2 ms = new MergeSort2();
        System.out.println(Arrays.toString(ms.merge(unsortedArray, arrayLength)));

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
