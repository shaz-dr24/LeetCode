import java.util.*;
class Solution {
    public int firstMissingPositive(int[] arr) {
ArrayList<Integer> al=new ArrayList<>();
for(int i=0;i<arr.length;i++){
    if(arr[i]>0) {
    	al.add(arr[i]);
    }
}
int [] res=new int[al.size()];
for(int i=0;i<al.size();i++) {
	res[i]=al.get(i);
}
Arrays.sort(res);
int expected=1;
for(int i=0;i<res.length;i++) {
	if(res[i]==expected) {
		expected=expected+1;
	}
	else if(res[i]<expected) {
		continue;
	}
	else {
		break;
	}
}
//System.out.println(expected);
return expected;
    }
}