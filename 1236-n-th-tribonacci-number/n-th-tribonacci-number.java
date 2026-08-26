class Solution {
    public int tribonacci(int n) {
    int []dp=new int[n+1];
	if(n==0) {
		//System.out.println(0);
        return 0;
	}
	if(n==1) {
		//System.out.println(1);
        return 1;
	}
	if(n==2) {
		//System.out.println(1);
        return 1;
	}
	dp[0]=0;
	dp[1]=1;
	dp[2]=1;
	int i=3;
	while(i<=n) {
		dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
		i=i+1;
	}
	//System.out.println(dp[n]);
    return dp[n];
    }
}