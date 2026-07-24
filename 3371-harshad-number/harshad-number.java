class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sumNumber=sumNum(x);
        if(x%sumNumber==0){
            return sumNumber;
        }
        return -1;
    }
    public int sumNum(int x){
        int sum=0;
        while(x>0){
        int d;
        d=x%10;
        sum=sum+d;
        x=x/10;
        }
        return sum;
    }
}