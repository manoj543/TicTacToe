package Player;

import java.util.Scanner;

public class ComputerPlayer extends Player{
    public ComputerPlayer(char sym){
        this.symbol = sym;
    }
    public int[] makeMove(){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        return new int[]{x, y};
    }
}
