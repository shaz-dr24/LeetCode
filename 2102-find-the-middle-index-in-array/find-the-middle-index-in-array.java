class Solution {
    public int findMiddleIndex(int[] arr) {
        	for(int i=0;i<arr.length;i++) {
		int lsum=0;
		int rsum=0;
		for(int j=0;j<i;j++) {
			lsum=lsum+arr[j];
		}
		for(int j=arr.length-1;j>i;j--) {
			rsum=rsum+arr[j];
		}
		if(lsum==rsum) {
			//System.out.println(i);
            return i;
		}
	}
    return -1;
    }
}