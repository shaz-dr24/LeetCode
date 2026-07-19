import java.util.*;
class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        String[] arr = s.split("");
        String[] arr2 = goal.split("");
        int size = s.length();
        int j = 0;
        while (j < size) {
            String temp = arr[0];
            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[arr.length - 1] = temp;
            if (Arrays.equals(arr, arr2)) {
                return true;
            }
            j++;
        }
        return false;
    }
}