class Solution {
    public boolean checkDivisibility(int n) {
        if(n%(sumNum(n)+prodNum(n))==0) {
		return true;
	}
	return false;
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