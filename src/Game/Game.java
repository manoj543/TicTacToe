package Game;
import Player.Player;
import WinnerStrategy.*;
import Game.Board;

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

    public void run(){
        int turns = (this.board.length)*(this.board.length);
        int i = 0;
        while(i <= turns){

        }
    }
}
