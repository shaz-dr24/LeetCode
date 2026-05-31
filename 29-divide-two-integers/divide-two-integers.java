import java.util.*;

class Solution {
    public int divide(int dividend, int divisor) {

        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        int val1 = dividend;
        int val2 = divisor;

        int res = val1 / val2;

        return res;
    }
}