import java.util.*;
class Solution {
    public int[] leftRightDifference(int[] arr) {
        	int [] leftsum=new int[arr.length];
	int [] rightsum=new int[arr.length];
	leftsum[0]=0;
	rightsum[rightsum.length-1]=0;
	int k=1;
	for(int i=1;i<arr.length;i++) {
		int sum=0;
		for(int j=0;j<i;j++) {
			sum=sum+arr[j];
		}
			leftsum[k]=sum;
			k++;
		
	}
	int l=arr.length-2;
	for(int i=arr.length-2;i>=0;i--) {
		int sum=0;
		for(int j=arr.length-1;j>i;j--) {
			sum=sum+arr[j];
		}
		rightsum[l]=sum;
		l--;
	}
//	System.out.println(Arrays.toString(leftsum));
//	System.out.println(Arrays.toString(rightsum));
	int [] res=new int[arr.length];
	int x=0;
	int y=0;
	int z=0;
	while(x<leftsum.length&&y<rightsum.length) {
		int diff;
		diff=Math.abs(leftsum[x]-rightsum[y]);
		res[z]=diff;
		x++;
		y++;
		z++;
	}
    return res;
    }
}