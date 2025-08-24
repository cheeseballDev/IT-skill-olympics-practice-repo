

public class RotateAMatrix {
    public static void main(String[] args) {
        RotateAMatrix  rm = new RotateAMatrix();
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        rm.rotateCW(array);
    }

    private void rotateCW(int[][] mat) {
    final int M = mat.length;
    final int N = mat[0].length;
    int[][] ret = new int[N][M];
    for (int r = 0; r < M; r++) {
        for (int c = 0; c < N; c++) {
            ret[c][M-1-r] = mat[r][c];
        }
    }

    for (int r = 0; r < M; r++) {
        for (int c = 0; c < N; c++) {
            System.out.print(ret[r][c] + " ");
        }
        System.out.println();
    }
    
    
}
}
