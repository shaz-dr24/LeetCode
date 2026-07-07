class Solution {
   
    public static int sumNum(int n){
        int sum = 0;
        while(n > 0){
            int d = n % 10;
            if(d != 0){
                sum = sum + d;
            }
            n = n / 10;
        }
        return sum;
    }

    public long sumAndMultiply(int n) {
        StringBuffer sb = new StringBuffer("");
        String number = String.valueOf(n);

        for(int i = 0; i < number.length(); i++){
            char ch = number.charAt(i);
            if(ch != '0'){
                sb.append(ch);
            }
        }

        String value = sb.toString();

        // Handle the case when n = 0
        if(value.length() == 0){
            return 0;
        }

        int ans = Integer.parseInt(value);

        long result = 1L * ans * sumNum(n);

        return result;
    }
}