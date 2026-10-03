import java.util.*;
class Solution {
    public int findPeakElement(int[] arr) {
    int max=Integer.MIN_VALUE;
	int val=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>max) {
			max=arr[i];
			val=i;
		}
	}
    return val;
    }
}