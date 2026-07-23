import java.util.*;
class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int count=0;
        for(int i=0;i<nums.length;i++){
           // int count=0;
            int sum=0;
            for(int j=i;j<nums.length;j++){
                sum=sum+nums[j];
                if(sum==goal){
                    count=count+1;
                }
            }
        }
        return count;
    }
}