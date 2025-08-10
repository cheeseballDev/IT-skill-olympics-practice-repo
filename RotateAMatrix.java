public class RotateAMatrix {
    public static void main(String[] args) {
        RotateAMatrix  rm = new RotateAMatrix();
        rm.solve();
    }

    private void solve() {
        int[][] arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        System.out.println("Input: ");
        for(int i = 0; i < arr.length; i++) {
            for(int l = 0; l < arr[i].length; l++) {
                System.out.print(arr[i][l]);
            }
            System.out.println();
        }

        System.out.println("Output: ");
        int vertical = arr.length;
        int horizontal = arr[0].length;
        for(int i = 0; i < vertical; i++) {
            for (int l = 0; l < horizontal; l++) {
                arr[l][horizontal - 1 - i] = arr[i][l];
            }
        }
        
        for(int i = 0; i < arr.length; i++) {
            for(int l = 0; l < arr[i].length; l++) {
                System.out.print(arr[i][l]);
            }
            System.out.println();
        }
    }
}
