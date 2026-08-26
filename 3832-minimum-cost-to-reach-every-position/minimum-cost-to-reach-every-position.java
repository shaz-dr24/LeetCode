class Solution {
    public int[] minCosts(int[] arr) {
        	int[] res=new int[arr.length];
    for(int i=0;i<arr.length;i++) {
    	ArrayList<Integer> al=new ArrayList<>();
    	for(int j=0;j<=i;j++) {
    		al.add(arr[j]);
    	}
    	int min=Collections.min(al);
    	res[i]=min;
    }
    return res;
    }
}