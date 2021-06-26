package Player;

import java.util.Scanner;

public class ComputerPlayer extends Player{
    public ComputerPlayer(char sym, String name){
        this.symbol = sym;
        this.name = name;
    }
    public int[] makeMove(){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        return new int[]{x, y};
    }
    public String getName(){
        return this.name;
    }
    public char getSymbol(){
        return this.symbol;
    }
}
