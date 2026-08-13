class Solution {
    public int[] finalPrices(int[] arr) {
        	int [] res=new int[arr.length];
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]>=arr[j]) {
				int diff=arr[i]-arr[j];
				res[i]=diff;
				break;
			}
			if(j==arr.length-1) {
                    res[i]=arr[i];
                }
		}
	}
	int last=arr[arr.length-1];
	//System.out.println(last);
	res[res.length-1]=last;
    return res;
    }
}