import java.util.*;
public leet{
    public int maximumWealth(int[][] accounts) {
        // creates array of amount of accounts dollars
        int [] wealth = new int[accounts.length];
        for (int i = 0; i < accounts.length; i++){
            for (int j = 0; j < accounts[i].length; j++){
            wealth[i] += accounts[i][j];
        }
    }
    int max = 0;

        for (int k = 0; k < wealth.length; k++){
            if (wealth[k] > max){
                max = wealth[k];
            }
        }
    return max;
}
}
