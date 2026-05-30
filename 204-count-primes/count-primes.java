class Solution {

    public static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }

        for(int i = 2; i * i <= n; i++){
            if(n % i == 0){
                return false;
            }
        }

        return true;
    }

    public int countPrimes(int n) {
        int count = 0;

        for(int i = 0; i < n; i++){
            if(isPrime(i)){
                count = count + 1;
            }
        }

        return count;
    }
}
