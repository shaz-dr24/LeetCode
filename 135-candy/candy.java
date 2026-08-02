class Solution {
    public int candy(int[] arr) {
    int [] ans=new int[arr.length];
	for(int i=0;i<arr.length;i++) {
		ans[i]=1;
	}
	for(int i=1;i<arr.length;i++) {
		if(arr[i]>arr[i-1]) {
			ans[i]=ans[i-1]+1;
		}
	}
	
	for(int i=arr.length-2;i>=0;i--) {
		if(arr[i]>arr[i+1]) {
			int max=Math.max(ans[i],ans[i+1]+1);
			ans[i]=max;
		}
       
	}
     int sum=0;
        for (int i = 0; i < ans.length; i++) {
            sum += ans[i];
        }

        return sum;
    }
}