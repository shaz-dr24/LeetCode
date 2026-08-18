class Solution {
    public int largestInteger(int[] nums, int k) {

        int[] temp = nums.clone();
        Arrays.sort(temp);

        int ans = -1;

        for (int a = 0; a < temp.length; a++) {

            int candidate = temp[a];
            int count = 0;

            for (int i = 0; i <= nums.length - k; i++) {

                boolean found = false;

                for (int j = i; j < i + k; j++) {

                    if (nums[j] == candidate) {
                        found = true;
                        break;
                    }
                }

                if (found) {
                    count++;
                }
            }

            if (count == 1) {
                ans = Math.max(ans, candidate);
            }
        }

        return ans;
    }
}