import java.util.*;
class Solution {
    public int[] buildArray(int[] nums) {
        int [] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int val=nums[i];
            ans[i]=nums[val];
        }
        return ans;
    }
}