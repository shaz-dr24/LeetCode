import java.util.*;
class Solution {
    public int firstMissingPositive(int[] nums) {
        ArrayList<Integer> al = new ArrayList<>();
        // Store only positive numbers
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                al.add(nums[i]);
            }
        }
        int[] arr = new int[al.size()];
        for (int i = 0; i < al.size(); i++) {
            arr[i] = al.get(i);
        }
        Arrays.sort(arr);
        int expected = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == expected) {
                expected++;
            }
            // Ignore duplicates
            else if (arr[i] < expected) {
                continue;
            }
            else {
                break;
            }
        }
        return expected;
    }
}