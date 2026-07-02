import java.util.*;

class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int sum = 0;
        double average = 0;

        ArrayList<Double> al = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            sum = sum + nums[i];
        }

        average = (double) sum / k;   
        al.add(average);
        for (int i = k; i < nums.length; i++) {
            sum = sum + nums[i];
            sum = sum - nums[i - k];

            average = (double) sum / k;
            al.add(average);
        }

        double max = al.get(0);

        for (int i = 1; i < al.size(); i++) {
            if (al.get(i) > max) {
                max = al.get(i);
            }
        }

        return max;
    }
}