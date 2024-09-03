import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                board[row][col] = ' ';
            }
        }
        Scanner scanner = new Scanner(System.in);

        boolean gameover = false;
        char player = 'x';
        while (!gameover) {
            printBoard(board);
            System.out.println("enter row and col ->");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            // there should be now value in that box
            if (board[row][col] == ' ') {
                // is the playwe won the match
                if (player == 'x') {
                    player = 'o';

                } else {
                    player = 'x';
                }
                board[row][col] = player;
                boolean playerWon = gameWon(board, player);
                if (playerWon) {
                    System.out.println(player + " player is won");
                    printBoard(board);
                    break;
                }
            } else {
                System.out.println("position is alredy filled");
            }
        }
    }

    private static void printBoard(char[][] board) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                System.out.print(" | " + board[row][col]);
            }
            System.out.println();

        }
    }

    private static boolean gameWon(char[][] board, char player) {

        // write condition for rows
        for (int row = 0; row < board.length; row++) {
            if (board[row][0] == player && board[row][1] == player && board[row][2] == player) {
                return true;
            }
        }

        // write condition for coloums
        for (int col = 0; col < board[0].length; col++) {
            if (board[0][col] == player && board[1][col] == player && board[2][col] == player) {
                return true;

            }
        }

        // check for diagunal
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }
        if (board[0][2] == player && board[1][2] == player && board[2][2] == player) {
            return true;
        }

        return false;
    }
}
