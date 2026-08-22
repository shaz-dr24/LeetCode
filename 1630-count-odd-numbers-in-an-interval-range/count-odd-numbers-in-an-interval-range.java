import java.util.*;
class Solution {
    public int countOdds(int low, int high) {
        int count = high - low + 1;
        int result = count / 2;
        if (low % 2 != 0 && high % 2 != 0) {
            result = result + 1;
        }
        return result;
    }
}