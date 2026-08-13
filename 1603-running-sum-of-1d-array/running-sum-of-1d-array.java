import java.util.*;
class Solution {
    public int[] runningSum(int[] arr) {
        	int [] res=new int[arr.length];
	for(int i=0;i<arr.length;i++) {
		int sum=0;
		for(int j=0;j<=i;j++) {
			sum=sum+arr[j];
			res[j]=sum;
		}
	}
    return res;
    }
}