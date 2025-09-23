public class RotateAMatrix6 {
    public static void main(String[] args) {
        int[][] matrix = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        int matrixRow = matrix.length;
        int matrixCol = matrix[0].length;

        int[][] tempMatrix = new int[matrixRow][matrixCol];

        for(int i = 0; i < matrixRow; i++) {
            for(int j = 0; j < matrixCol; j++) {
                tempMatrix[j][matrixRow - 1 - i] = matrix[i][j]; 
            }
        }

        for(int i = 0; i < matrixRow; i++) {
            for(int j = 0; j < matrixCol; j++) {
                System.out.print(tempMatrix[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
