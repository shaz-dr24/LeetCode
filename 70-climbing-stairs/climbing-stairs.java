class Solution {
    public int climbStairs(int n) {
    int [] dp=new int[n+1];
    	if(n==1) {
		//System.out.println(1);
        return 1;
	}
	if(n==2) {
		//System.out.println(2);
        return 2;
	}
	// if(n==3) {
	// 	//System.out.println(3);
    //     return 3;
	// }
	dp[0]=0;
	dp[1]=1;
	dp[2]=2;
	dp[3]=3;
	

	
	int i=4;
	while(i<=n) {
		dp[i]=dp[i-1]+dp[i-2];
		i++;
	}
	//System.out.println(dp[n]);
    return dp[n];
    }
}