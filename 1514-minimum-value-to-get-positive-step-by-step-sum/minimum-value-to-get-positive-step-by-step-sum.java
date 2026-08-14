import java.util.*;
class Solution {
    public int minStartValue(int[] nums) {
        for(int i=1;i<Integer.MAX_VALUE;i++){
            int sum=i;
            boolean flag=true;
            for(int j=0;j<nums.length;j++){
                sum=sum+nums[j];
                if(sum<=0){
                    flag=false;
                    break;
                }
            }
            if(flag){
            return i;
        }
        }
        return -1;
    }
}