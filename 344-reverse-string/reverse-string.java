import java.util.*;
class Solution {
    public void reverseString(char[] s) {
        StringBuffer sb=new StringBuffer("");
        int size=s.length;
        for(int i=0;i<s.length;i++){
            sb.append(s[i]);
        }
        String str=sb.reverse().toString();
        for (int i=0;i<s.length;i++) {
            s[i]=str.charAt(i);
        }
    }
}