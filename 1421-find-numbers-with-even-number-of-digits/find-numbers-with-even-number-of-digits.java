import java.util.*;
class Solution {
    public int findNumbers(int[] arr) {
    int [] res=new int[arr.length];
	for(int i=0;i<arr.length;i++) {
		res[i]=countNum(arr[i]);
	}
	int eveCount=0;
	for(int i=0;i<res.length;i++) {
		if(res[i]%2==0) {
			eveCount=eveCount+1;
		}
	}
	return eveCount;
}
public static int countNum(int num) {
	int count=0;
	while(num>0) {
		int d;
		d=num%10;
		count=count+1;
		num=num/10;
	}
	return count;
}
    }
