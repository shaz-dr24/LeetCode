import java.util.*;
class Solution {
    public int[] sortArrayByParity(int[] arr) {
        	int eveCount=0;
	int oddCount=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]%2==0) {
			eveCount=eveCount+1;
		}
		else
		oddCount=oddCount+1;
	}
	//System.out.println(eveCount);
	//System.out.println(oddCount);
	int [] eveArr=new int[eveCount];
	int[] oddArr=new int[oddCount];
	int k=0; 
	int l=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]%2==0) {
			eveArr[k]=arr[i];
			k=k+1;
		}
	}
	for(int i=0;i<arr.length;i++) {
		if(arr[i]%2!=0) {
			oddArr[l]=arr[i];
			l=l+1;
		}
	}
	//System.out.println(Arrays.toString(eveArr));
	//System.out.println(Arrays.toString(oddArr));
	int res[] =new int[arr.length];
	for(int i=0;i<eveArr.length;i++) {
		res[i]=eveArr[i];
	}
	int m=eveArr.length;
	for(int i=0;i<oddArr.length;i++) {
		res[m]=oddArr[i];
		m=m+1;
	}
	//System.out.println(Arrays.toString(res));
    return res;
    }
}