import java.util.*;
class Solution {
    public int[] getConcatenation(int[] arr) {
    int n=arr.length;
	int [] res=new int[arr.length*2];
	for(int i=0;i<arr.length;i++) {
		res[i]=arr[i];
	}
	for(int i=0;i<arr.length;i++) {
		res[n]=arr[i];
		n++;
	}
    return res;
    }
}