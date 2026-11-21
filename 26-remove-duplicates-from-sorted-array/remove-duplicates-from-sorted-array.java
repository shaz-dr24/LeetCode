
import java.util.*;

class Solution {
    public int removeDuplicates(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        int j = 0;

        for(Integer x : set) {
            nums[j] = x;
            j++;
        }

        Arrays.sort(nums, 0, j);

        return j;
    }
}
