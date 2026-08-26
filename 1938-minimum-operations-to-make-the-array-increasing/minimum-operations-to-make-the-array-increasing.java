class Solution {
    public int minOperations(int[] arr) {
    int []res=new int[arr.length];
    res[0]=arr[0];
    int cost=0;
    for(int i=1;i<arr.length;i++) {
    	int fir=res[i-1];
    	int sec=arr[i];
    	int target=fir+1;
    	if(target>sec) {
    		res[i]=target;
    		cost=cost+(target-sec);
    	}
    	else {
    		res[i]=sec;
    	}
    }
   // System.out.println(cost);
   return cost;
    }
}