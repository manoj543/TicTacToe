package Factories;
import Player.*;

public class PlayerFactory {
    static int y = 0;
    public static Player getPlayer(String type){
        char sym;
        String name;
        if(type.equals("Human")){
            if(y == 0){
                sym = 'X';
                name = "Player X";
            }
            else{
                sym = 'O';
                name = "Player O";
            }
            y = (y+1)%2;
            return new HumanPlayer(sym, name);
        }
        else{
            if(y == 0){
                sym = 'X';
                name = "Player X";
            }
            else{
                sym = 'O';
                name = "Player O";
            }
            y = (y+1)%2;
            return new ComputerPlayer(sym, name);
        }
    }
}
