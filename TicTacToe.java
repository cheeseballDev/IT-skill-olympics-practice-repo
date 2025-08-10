import java.util.Scanner;

public class TicTacToe {

    boolean victoryCondition = false;
    public static void main(String[] args) {
        TicTacToe tt = new TicTacToe();
        tt.solve();
    }

    private void solve() {
        Scanner userInput = new Scanner(System.in);
        
        String[][] board = {
            {"_","_","_"},
            {"_","_","_"},
            {"_","_","_"}
        };

        int[][][] winningCombos = {
            {{0, 0}, {0, 1}, {0, 2}}, // Row 1
            {{1, 0}, {1, 1}, {1, 2}}, // Row 2
            {{2, 0}, {2, 1}, {2, 2}}, // Row 3
            {{0, 0}, {1, 0}, {2, 0}}, // Col 1
            {{0, 1}, {1, 1}, {2, 1}}, // Col 2
            {{0, 2}, {1, 2}, {2, 2}}, // Col 3
            {{0, 0}, {1, 1}, {2, 2}}, // Diagonal \
            {{0, 2}, {1, 1}, {2, 0}}  // Diagonal /
        };

        while(!victoryCondition) {
        
            for(int i = 0; i < board.length; i++) {
                for(int j = 0; j < board[i].length; j++) {
                    System.out.print("|"+ board[i][j] + "|");
                }
                System.out.println("");
            }

            for(int[][] combo: winningCombos) {
                if(board[combo[0][0]][combo[0][1]].equals("X")) && 
            }

            System.out.print("Player one: ");
            int playerOneChoice1 = userInput.nextInt();
            int playerOneChoice2 = userInput.nextInt();

            if(board[playerOneChoice1][playerOneChoice2].contains("X") || board[playerOneChoice1][playerOneChoice2].contains("O")) {
                System.out.println("There is already someone there!");
            } else {
                board[playerOneChoice1][playerOneChoice2] = "X";
            }
        }
        System.out.println("you win");
    }
}
