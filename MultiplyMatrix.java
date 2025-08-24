public class MultiplyMatrix {
    public static void main(String[] args) {
        int[][] array1 = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        int arrRow = array1.length;
        int arrCol = array1[0].length;

        int[][] array2 = {
            {2,2,2},
            {2,2,2},
            {2,2,2}
        };

        int arrRow2 = array2.length;
        int arrCol2 = array2[0].length;


        int[][] result = new int[arrRow][arrCol];

        for(int i = 0; i < arrRow; i++) {
            for(int j = 0; j < arrCol2; j++) {
                for(int k = 0; k < arrCol; k++) {
                    result[i][j] += array1[i][k] * array2[k][j];
                }
            }
        }

        for(int i = 0; i < arrRow; i++) {
            for(int j = 0; j < arrCol; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
