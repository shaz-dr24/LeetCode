import java.util.*;
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        double average=0;
        double maxavg=Integer.MIN_VALUE;
        for(int i=0;i<k;i++){
            sum=sum+nums[i];
        }
        average=(double) sum/k;
        maxavg=average;
        for(int i=k;i<nums.length;i++){
            sum=sum-nums[i-k];
            sum=sum+nums[i];
        average=(double)sum/k;
        if(average>maxavg){
               maxavg=average;
        }
    }
    if(maxavg==Integer.MIN_VALUE){
        return 0;
    }
    return maxavg;
}
}