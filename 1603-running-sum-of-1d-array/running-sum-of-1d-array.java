import java.util.*;
class Solution {
    public int[] runningSum(int[] nums) {
        ArrayList<Integer>al=new ArrayList<>();
        int [] res=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=0;j<=i;j++){
                sum=sum+nums[j];
            }
            al.add(sum);

        }
        for(int i=0;i<nums.length;i++){
            res[i]=al.get(i);
        }
        return res;
    }
}