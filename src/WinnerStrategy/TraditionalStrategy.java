package WinnerStrategy;
import java.util.HashMap;

public class TraditionalStrategy implements WinnerStrategy {
    @Override
    public char checkWinner(char[][] A) {
        char winner;
        int dimension = A.length;
        HashMap<Character, Integer> symbolMap = new HashMap<>();
        symbolMap.put('X', 1);
        symbolMap.put('O', 0);
        symbolMap.put('_', dimension);
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        int sum4 = 0;
        for(int i=0;i<dimension;i++){
            sum1 = 0;
            sum2 = 0;
            sum3 = sum3 + symbolMap.get(A[i][i]);
            for(int j=0;j<dimension;j++){
                sum1 = sum1 + symbolMap.get(A[i][j]);
                sum2 = sum2 + symbolMap.get(A[i][j]);
            }
        }
        if(sum1 == dimension || sum2 == dimension || sum3 == dimension){
            winner = 'X';
        }
        else if(sum1 == 0 || sum2 == 0 || sum3 == 0){
            winner = 'O';
        }
        else{
            int x;
            int y;
            for(int i=dimension-1;i>-1;i--){
                y = i;
                x = dimension-1-y;
                sum4 = sum4 + symbolMap.get(A[x][y]);
            }
            if(sum4 == dimension){
                winner = 'X';
            }
            else if(sum4 == 0)
                winner = 'O';
            else{
                winner = '!';
            }
        }

        return winner;
    }
}
