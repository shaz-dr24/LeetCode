import java.util.*;
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> al=new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            boolean flag=true;
            for(int j=0;j<candies.length;j++){
                if(candies[i]+extraCandies<candies[j]){
                    flag=false;
                    break;
                }
            }
            al.add(flag);
        }
        return al;
    }
}