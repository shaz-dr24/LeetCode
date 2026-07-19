import java.util.*;
class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '#') {
                if (!st1.isEmpty()) {
                    st1.pop();
                }
            } else {
                st1.push(ch);
            }
        }
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if (ch == '#') {
                if (!st2.isEmpty()) {
                    st2.pop();
                }
            } else {
                st2.push(ch);
            }
        }
        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer();
        while (!st1.isEmpty()) {
            sb1.append(st1.pop());
        }
        while (!st2.isEmpty()) {
            sb2.append(st2.pop());
        }
        String s1=sb1.toString();
        String s2=sb2.toString();
        if(s1.equals(s2)){
            return true;
        }
        return false;
    }
}