import java.util.*;
class Solution {
    public int subtractProductAndSum(int n) {
        	int val1=prodNum(n);
	int val2=sumNum(n);
	int ans=val1-val2;
	//System.out.println(ans);
    return ans;
	
}
public static int sumNum(int n) {
	int sum=0;
	while(n>0) {
		int d;
		d=n%10;
		sum=sum+d;
		n=n/10;
	}
	return sum;
}

public static int prodNum(int n) {
	int prod=1;
	while(n>0) {
		int d;
		d=n%10;
		prod=prod*d;
		n=n/10;
	}
	return prod;
}
    }
