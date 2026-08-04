import java.util.*;
class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        	ArrayList<Integer> al=new ArrayList<>();
	for(int i=0;i<matrix.length;i++) {
		
		for(int j=0;j<matrix[i].length;j++) {
			
			al.add(matrix[i][j]);
		}
	}
	Collections.sort(al);
	// //System.out.println(al);
	// int [] arr=new int[al.size()];
	// for(int i=0;i<al.size();i++) {
	// 	arr[i]=al.get(i);
	// }
	// int val=0;
	// for(int i=0;i<arr.length;i++) {
	// 	if(i==k) {
	// 		val=arr[i-1];
	// 	}
	// }
    // return val;
    return al.get(k-1);
    }
}