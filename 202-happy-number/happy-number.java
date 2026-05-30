class Solution {

    public static int sqAdd(int n){
        int sum=0;
        while(n>0){
            int d;
            d=n%10;
            sum=sum+d*d;
            n=n/10;
        }
        return sum;
    }

        public static boolean isHappy(int n) {
        while(n!=1&&n!=4){
            n=sqAdd(n);
        }
        if(n==1){
            return true;
        }
        return false;
    }

}