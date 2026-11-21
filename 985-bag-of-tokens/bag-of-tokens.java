import java.util.*;
class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int score=0;
        int i=0;
        int max=0;
        int j=tokens.length-1;
        while(i<=j){
            if(tokens[i]<=power){
                power=power-tokens[i];
                score=score+1;
                i++;
            }
            else if(score>=1){
                power=power+tokens[j];
                score=score-1;
                j--;
            }
else{
    break;
}
 if(score > max) {
                max = score;
            }
        }
        return max;
    }
}