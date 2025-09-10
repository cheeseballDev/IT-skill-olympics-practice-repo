public class RotateAMatrix3 {
    public static void main(String[] args) {
        RotateAMatrix3 rm = new RotateAMatrix3();
        rm.solve();
    }

    private void solve() {
        int[][] array = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        int arrayLength = array.length;
        int arrayColumn = array[0].length;

        int[][] temp = new int[arrayLength][arrayColumn];

        for(int i = 0; i < arrayLength; i++) {
            for(int j = 0; j < arrayColumn; j++) {
                temp[j][arrayLength - 1 - i] = array[i][j];
            }
        }

        for(int i = 0; i < arrayLength; i++) {
            for(int j = 0; j < arrayColumn; j++) {
                System.out.print(temp[i][j]);
            }
            System.out.println();
        }
        
    }
}
