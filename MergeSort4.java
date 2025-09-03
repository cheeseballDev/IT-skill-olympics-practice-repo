
import java.util.Arrays;

public class MergeSort4 {
    public static void main(String[] args) {
        MergeSort4 ms = new MergeSort4();
        ms.solve();
    }

    private void solve() {
        int[] array = {1, 6, 21, 5, 99, 2, 12, 8};  
        int arrayLength = array.length;
        System.out.println(Arrays.toString(merge(array, arrayLength)));
    }

    private int[] merge(int[] array, int length) {
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
