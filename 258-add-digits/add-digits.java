class Solution {
    public int addDigits(int n) {
        	while(n>9) {
		int val=addNum(n);
		n=val;
	}
	//System.out.println(n);
    return n;

}
public static int addNum(int n) {
	int sum=0;
	while(n>0) {
		int d;
		d=n%10;
		sum=sum+d;
		n=n/10;
	}
	return sum;
}
    }
