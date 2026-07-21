import java.util.*;
class Solution {
    public String decodeString(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch != ']') {
                st.push(ch);
            }
            else {
                StringBuffer sb = new StringBuffer();
                while(st.peek() != '[') {
                    sb.append(st.pop());
                }
                sb.reverse();
                st.pop();
                StringBuffer num = new StringBuffer();
                while(!st.isEmpty() && Character.isDigit(st.peek())) {
                    num.append(st.pop());
                }
                num.reverse();
                int k = Integer.parseInt(num.toString());
                for(int j = 0; j < k; j++) {
                    for(int x = 0; x < sb.length(); x++) {
                        st.push(sb.charAt(x));
                    }
                }
            }
        }
        StringBuffer ans = new StringBuffer();
        while(!st.isEmpty()) {
            ans.append(st.pop());
        }
        return ans.reverse().toString();
    }
}