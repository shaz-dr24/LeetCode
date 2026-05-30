class Solution {
    public boolean isPalindrome(int x) {
        int d;
        int temp=x;
        int rev=0;
        while(temp>0){
            d=temp%10;
            rev=rev*10+d;
            temp=temp/10;
        }
        if(rev==x){
            return true;
        }
        return false;
        }

        
    }
