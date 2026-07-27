import java.util.*;
class Solution {
    public int maxProduct(int[] nums) {
                int firstmax = Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 0; i <nums.length; i++) {
            al.add(nums[i]);
        }
        firstmax = Collections.max(al);
        al.remove(Integer.valueOf(firstmax));
        secondmax = Collections.max(al);
        al.remove(Integer.valueOf(secondmax)); 
        int ans=(firstmax-1)*(secondmax-1);
        return ans;
    }
}