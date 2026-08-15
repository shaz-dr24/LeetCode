import java.util.*;
class Solution {
    public int largestAltitude(int[] gain) {
        	int [] ans=new int[gain.length+1];
    for(int i=0;i<gain.length;i++) {
    	int sum=0;
    	for(int j=0;j<=i;j++) {
    		sum=sum+gain[j];
    		ans[j+1]=sum;
    	}
    }
    int max=Integer.MIN_VALUE;
	//System.out.println(Arrays.toString(ans));
    for(int i=0;i<ans.length;i++) {
    	if(ans[i]>max) {
    		max=ans[i];  	
    	}
    }
    //System.out.println(max);
    return max;
    }
}