import java.util.Scanner;
import Factories.GameFactory;
import Game.Game;

public class Client {
    public static void main(String[] args){
        System.out.println("Enter the dimension type1 type2 level");
        Scanner sc = new Scanner(System.in);
        int dimension = sc.nextInt();
        String type1 = sc.next();
        String type2 = sc.next();
        String level = sc.next();
        Game myGame = GameFactory.launch(dimension, level, type1, type2);
        myGame.run();
    }
}
