import java.util.*;
class Solution {
    public int findLengthOfLCIS(int[] arr) {
    int count=0;
    int max=0;
    for(int i=0;i<arr.length-1;i++) {
    	if(arr[i]<arr[i+1]) {
    		count=count+1;
    	}
    	else {
    		count=0;
    	}
    	max=Math.max(count,max);
    }
    return max+1;
    }
}