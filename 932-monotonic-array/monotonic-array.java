import java.util.*;
class Solution {
    public boolean isMonotonic(int[] nums) {
        int[] asc = nums.clone();
        Arrays.sort(asc);
        int[] rev = revArray(asc.clone());
        if (Arrays.equals(nums, asc) || Arrays.equals(nums, rev)) {
            return true;
        }
        return false;
    }
    public static int[] revArray(int[] asc) {
        int left = 0;
        int right = asc.length - 1;

        while (left < right) {
            int temp = asc[left];
            asc[left] = asc[right];
            asc[right] = temp;
            left++;
            right--;
        }

        return asc;
    }
}