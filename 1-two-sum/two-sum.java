import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            al.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
            if(al.get(i)+al.get(j)==target){
                return new int[]{i, j};
            }
            }
        }
        return new int[]{};
    }
}