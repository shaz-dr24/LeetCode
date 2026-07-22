class Solution {
    public int pivotIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int ls = 0;
            int rs = 0;
            for (int j = 0; j < i; j++) {
                ls += nums[j];
            }
            for (int j = nums.length - 1; j > i; j--) {
                rs += nums[j];
            }
            if (ls == rs) {
                return i;
            }
        }
        return -1;
    }
}