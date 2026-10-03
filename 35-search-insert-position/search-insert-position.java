import java.util.*;
class Solution {
    public int searchInsert(int[] nums, int target) {
        boolean flag=false;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                flag=true;
                return i;
            }
        }
        if(!flag){
            for(int i=0;i<nums.length;i++){
                if(target<nums[i]){
                    flag=true;
                    return i;
                }
            }
        }

        if(!flag){
            return nums.length;
        }
        return -1;
    }
}