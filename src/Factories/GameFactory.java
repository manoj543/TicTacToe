package Factories;
import Game.Game;
import Player.Player;
import WinnerStrategy.*;

public class GameFactory {
    public static Game launch(int size, String level, String type1, String type2){
        Player p1 = PlayerFactory.getPlayer(type1);
        Player p2 = PlayerFactory.getPlayer(type2);
        WinnerStrategy ws = new TraditionalStrategy();
        return new Game(size, p1, p2, ws);
    }
}
