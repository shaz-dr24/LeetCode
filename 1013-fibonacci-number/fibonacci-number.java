class Solution {
    public int fib(int n) {
        if(n<=1){
            return n;
        }
        int [] dp=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        int i=2;
        while(i<=n){
            dp[i]=dp[i-1]+dp[i-2];
            i=i+1;
        }
        return dp[n];
    }
}