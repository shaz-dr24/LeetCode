class Solution {
    public int countDigits(int temp) {
        int num=temp;
        	int count=0;
	while(num>0) {
		int d=num%10;
		if(temp%d==0) {
			count=count+1;
		}
		num=num/10;
	}
	//System.out.println(count);
    return count;
}
    }
