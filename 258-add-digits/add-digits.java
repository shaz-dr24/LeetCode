class Solution {

    public static int sumNum(int num) {
        int sum = 0;

        while(num > 0){
            int d;
            d = num % 10;
            sum = sum + d;
            num = num / 10;
        }

        return sum;
    }

    public int addDigits(int num) {

        while(num > 9){
            num = sumNum(num);
        }

        return num;
    }
}