import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        char[][] board=new char[3][3];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j]=' ';
            }
        }
        int numberOfMoves=0;
        char player='X';
        boolean gameOver=false;

        while (!gameOver){
            printBoard(board);
            System.out.print("Player " + player + " enter your move:");
            int i=scanner.nextInt();
            int j=scanner.nextInt();
            if (board[i][j]==' ') {
                board[i][j] = player;
                numberOfMoves++;
                gameOver = hasWon(board, player);
                if (gameOver) {
                    System.out.println("Player " + player + " has won");
                } else {
                    player = (player == 'X') ? 'O' : 'X';
                }
                if (numberOfMoves==9){
                    System.out.println("Its a draw");
                    return;
                }
            }
                else {
                    System.out.println("Invalid move.Try again");
                }



        }

printBoard(board);











        }
        public static boolean hasWon(char[][] board,char player){
            for (int i = 0; i < board.length; i++) {
                if (board[i][0]==player && board[i][1]==player && board[i][2]==player){
                    return true;
                }
            }
            for (int j = 0; j < board[0].length; j++) {
                if (board[0][j]==player && board[1][j]==player && board[2][j]==player){
                    return true;
                }
            }
            if (board[0][0]==player && board[1][1]==player && board[2][2]==player){
                return true;
            }
            return board[0][2] == player && board[1][1] == player && board[2][0] == player;
        }
        public static void printBoard(char[][] board){
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[i].length; j++) {
                    System.out.print(board[i][j] + " | ");
                }
                System.out.println();
            }
        }

}
