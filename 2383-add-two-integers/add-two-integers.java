import java.math.*;
class Solution {
    public int sum(int num1, int num2) {
        String s1=String.valueOf(num1);
        String s2=String.valueOf(num2);
        BigInteger b1=new BigInteger(s1);
        BigInteger b2=new BigInteger(s2);
        BigInteger ans=b1.add(b2);
        return ans.intValue();
    }
}