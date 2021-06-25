package Factories;
import Player.*;

public class PlayerFactory {
    static int y = 0;
    public static Player getPlayer(String type){
        if(type.equals("Human")){
            char sym;
            if(y == 0) sym = 'X';
            else sym = 'o';
            y = (y+1)%2;
            return new HumanPlayer(sym);
        }
        else{
            char sym;
            if(y == 0) sym = 'X';
            else sym = 'o';
            y = (y+1)%2;
            return new ComputerPlayer(sym);
        }
    }
}
