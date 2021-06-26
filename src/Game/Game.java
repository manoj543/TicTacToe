package Game;
import Player.Player;
import WinnerStrategy.*;
//import Game.Board;

public class Game {
    private char[][] board;
    private WinnerStrategy WS;
    private Player p1;
    private Player p2;
    public Game(int size, Player p1, Player p2, WinnerStrategy s){
        this.board = new char[size][size];
        this.WS = s;
        this.p1 = p1;
        this.p2 = p2;
    }

    public Player getCurrentPlayer(int turn){
        return turn%2 == 0 ? p1 : p2;
    }
    public void initializeBoard(){
        for (int i = 0; i < this.board.length; i++){
            for (int j = 0; j < this.board.length; j++){
                this.board[i][j] = '_';
            }
        }
    }
    public void updateBoard(Player p, int[] position){
        this.board[position[0]][position[1]] = p.getSymbol();
    }
    public void printBoard(){
        for (char[] C : this.board) {
            for (int j = 0; j < this.board.length; j++) {
                System.out.print(C[j] + " ");
            }
            System.out.println();
        }
    }
    public void run(){
        initializeBoard();
        int turns = (this.board.length)*(this.board.length);
        int i = 0;
        while(i <= turns){
            Player p = getCurrentPlayer(i);
            System.out.println(p.getName() + ":  Please make a move");
            printBoard();
            int[] pos = p.makeMove();
            updateBoard(p, pos);
            char winner = this.WS.checkWinner(this.board);
            if(winner != '!'){
                System.out.println("Congratulations Player " + winner + ". You are the winner :)");
                break;
            }
            i++;
        }
    }
}
