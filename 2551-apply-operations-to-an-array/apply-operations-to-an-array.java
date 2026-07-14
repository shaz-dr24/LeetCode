class Solution {
    public int[] applyOperations(int[] nums) {
        int[] finarr = doOperation(nums);
        int count = 0;
        int[] arr2 = new int[nums.length];
        for (int i = 0; i < finarr.length; i++) {
            if (finarr[i] != 0) {
                arr2[count] = finarr[i];
                count++;
            }
        }
        while (count < arr2.length) {
            arr2[count] = 0;
            count++;
        }
        return arr2;
    }
    public int[] doOperation(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i] =nums[i]* 2;
                nums[i + 1] = 0;
            }
        }
        return nums;
    }
}