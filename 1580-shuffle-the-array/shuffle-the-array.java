import java.util.*;
class Solution {
    public int[] shuffle(int[] arr, int n) {
    int[] left=new int[n];
	int [] right=new int[n];
	for(int i=0;i<n;i++) {
		left[i]=arr[i];
	}
	//System.out.println(Arrays.toString(left));
	int k=0;
	for(int i=n;i<arr.length;i++) {
		right[k]=arr[i];
		k=k+1;
	}

     int[] res = new int[arr.length];
        int index=0;
        for(int i=0;i<n;i++) {
            res[index]=left[i];
            index++;
            res[index]=right[i];
            index++;
        }

        return res;
	//System.out.println(Arrays.toString(right));
	// StringBuffer sb=new StringBuffer("");
	// for(int i=0;i<left.length;i++) {
	// 	sb.append(String.valueOf(left[i]));
	// 	sb.append(String.valueOf(right[i]));
	// }
	// int [] res=new int[sb.length()];
	// int val=Integer.parseInt(sb.reverse().toString());
	// System.out.println(val);
	// int i=0;
	// while(val>0) {
	// 	int d=val%10;
	// 	res[i]=d;
	// 	val=val/10;
	// 	i=i+1;
	// }
    // return res;
    }
}