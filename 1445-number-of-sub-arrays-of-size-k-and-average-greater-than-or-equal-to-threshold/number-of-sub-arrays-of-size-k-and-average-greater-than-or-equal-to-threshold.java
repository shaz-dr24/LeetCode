class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum=0;
        int average=0;
        int count=0;
        for(int i=0;i<k;i++){
            sum=sum+arr[i];
        }
        average=sum/k;
        if(average>=threshold){
            count=count+1;
        }
        for(int i=k;i<arr.length;i++){
            sum=sum+arr[i];
            sum=sum-arr[i-k];
            average=sum/k;
            if(average>=threshold){
            count=count+1;
        }
        }
        return count;
    }
}