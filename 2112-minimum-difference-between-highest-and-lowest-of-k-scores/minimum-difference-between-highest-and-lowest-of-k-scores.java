class Solution {
    public int minimumDifference(int[] nums, int k) {
        int finmin = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i = 0; i <= nums.length-k; i++) {
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for(int j = i; j < i+k; j++) {
                if(nums[j] > max) {
                    max = nums[j];
                }
                if(nums[j] < min) {
                    min = nums[j];
                }
            }
            int ans = max - min;
            if(ans < finmin) {
                finmin = ans;
            }
        }
        return finmin;
    }
}