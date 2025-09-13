public class RotateAMatrix4 {
    public static void main(String[] args) {
        int[][] array = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        int row = array.length;
        int col = array[0].length;

        int[][] temp = new int[row][col];

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                temp[j][row - 1 - i] = array[i][j]; 
            }
        }

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                System.out.print(temp[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
