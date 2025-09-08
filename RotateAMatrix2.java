public class RotateAMatrix2 {
    public static void main(String[] args) {
        RotateAMatrix2 rm = new RotateAMatrix2();
        rm.solve();
    }
    private void solve() {
        int[][] array = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        // 3, 6, 9
        // 2, 5, 8
        // 1, 4, 7
        
        // 1 = 0,0 -> 2,0
        // 2 = 0,1 -> 1,0
        // 3 = 0,2 -> 0,0

        int arrRow = array.length;
        int arrCol = array[0].length;
        int[][] temp = new int[arrRow][arrCol];

        for(int i = 0; i < arrRow; i++) {
            for(int j = 0; j < arrCol; j++) {
                temp[arrCol - 1 - j][i] = array[i][j];
            }
        }

        for(int i = 0; i < arrRow; i++) {
            for(int j = 0; j < arrCol; j++) {
                System.out.print(temp[i][j] + " ");
            }
            System.out.println();
        }
    } 
}
