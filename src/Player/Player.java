package Player;

public abstract class Player {
    protected char symbol;
    protected String name;
    public abstract int[] makeMove();
    public abstract String getName();
    public abstract char getSymbol();
}
