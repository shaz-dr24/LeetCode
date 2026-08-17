import java.util.*;
class Solution {
    public int maxPower(String s) {
        int count=1;
        int max=Integer.MIN_VALUE;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                count=count+1;
            }
            else{
                count=1;
            }
            max=Math.max(count,max);
        }
        if(max==Integer.MIN_VALUE){
            return 1;
        }
        
        return max;
    }
}