import java.util.Scanner;

public class AddMatrix {
    public static void main(String[] args) {
        AddMatrix am = new AddMatrix();
        am.solve();

    }
    private void solve() {
        Scanner userInput = new Scanner(System.in);
        int[][] firstMatrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] secondMatrix = {
            {1, 1, 1},
            {1, 1, 1},
            {1, 1, 1}
        };

        for(int i = 0; i < firstMatrix.length; i++) {
            for(int j = 0; j < firstMatrix[i].length; j++) {
                firstMatrix[i][j] += secondMatrix[i][j];
            }
        }

        for(int i = 0; i < firstMatrix.length; i++) {
            for(int j = 0; j < firstMatrix[i].length; j++) {
                System.out.print(firstMatrix[i][j] + " ");
            }
            System.out.println();
        }


    }
}
