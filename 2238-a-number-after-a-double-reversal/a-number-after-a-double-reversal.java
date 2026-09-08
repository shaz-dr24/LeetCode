class Solution {
    public boolean isSameAfterReversals(int num) {
        int temp=num;
	for(int i=0;i<=1;i++) {
		temp=revNum(temp);
	}
    if(temp==num){
        return true;
    }
    return false;
    }
    public static int revNum(int num) {
	int rev=0;
	while(num>0) {
		int d;
		d=num%10;
		rev=(rev*10)+d;
		num=num/10;
		
	}
	return rev;
}
}