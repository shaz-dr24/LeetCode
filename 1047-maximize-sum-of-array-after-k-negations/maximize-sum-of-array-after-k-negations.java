import java.util.*;
class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        PriorityQueue <Integer> pq=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            pq.offer(nums[i]);
        }

        while(k>0){
            int min=pq.poll();
            pq.offer(-min);
            k=k-1;
        }
        int sum=0;
        while(!pq.isEmpty()){
            sum=sum+pq.poll();
        }
        return sum;
    }
}