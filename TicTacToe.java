import java.util.Scanner;

public class TicTacToe {
    private int[][] board = new int[3][3];
    private int currentPlayer = 1;

    public void playGame() {
        Scanner scanner = new Scanner(System.in);
        int moves = 0;

        while (moves < 9) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", enter your move (row and column): ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == 0) {
                board[row][col] = currentPlayer;
                moves++;

                if (checkWin()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    return;
                }

                currentPlayer = (currentPlayer == 1) ? 2 : 1;
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }

        printBoard();
        System.out.println("It's a draw!");
    }

    private boolean checkWin() {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) return true;
            if (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer) return true;
        }
        return (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) ||
               (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer);
    }

    private void printBoard() {
        for (int[] row : board) {
            for (int cell : row) {
                System.out.print((cell == 0 ? "." : (cell == 1 ? "X" : "O")) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.playGame();
    }
}
