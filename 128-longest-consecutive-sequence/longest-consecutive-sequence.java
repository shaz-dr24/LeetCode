import java.util.*;
class Solution {
    public int longestConsecutive(int[] arr) {
        	Arrays.sort(arr);
	if(arr.length==0) {
		//System.out.println(0);
		return 0;
	}
	int curr=1;
	int max=1;
	for(int i=0;i<arr.length-1;i++) {
		if(arr[i]==arr[i+1]) {
			continue;
		}
		if(arr[i+1]==arr[i]+1) {
			curr=curr+1;
		    max=Math.max(curr,max);
		}
		else {
			curr=1;
		}
        
	}
    return max;
    }
}