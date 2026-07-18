import java.util.*;
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int prod=1;
            for(int j=i;j<nums.length;j++){
                prod=prod*nums[j];
                if(k>prod){
                    count=count+1;
                }
                else{
                    break;
                }
            }
        }
        return count;
    }
}