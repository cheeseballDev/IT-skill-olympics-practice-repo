import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        TicTacToe tt = new TicTacToe();
        tt.solve();
    }

    private void solve() {
        Scanner userInput = new Scanner(System.in);
        
        char[][] board = {
            {'_','_','_'},
            {'_','_','_'},
            {'_','_','_'}
        };

        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j]);
            }
        }
    }
}
