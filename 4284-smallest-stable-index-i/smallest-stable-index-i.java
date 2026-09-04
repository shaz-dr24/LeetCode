class Solution {
    public int firstStableIndex(int[] arr, int k) {
        for(int i=0;i<arr.length;i++) {
		int max=Integer.MIN_VALUE;
		for(int j=0;j<=i;j++) {
			if(arr[j]>max) {
				max=arr[j];
			}
		}
		int min=Integer.MAX_VALUE;
		for(int l=i;l<arr.length;l++) {
			if(arr[l]<min) {
				min=arr[l];
			}
		}
		
		if(max-min<=k) {
			return i;
			
		}
	}
    return -1;
    }
}