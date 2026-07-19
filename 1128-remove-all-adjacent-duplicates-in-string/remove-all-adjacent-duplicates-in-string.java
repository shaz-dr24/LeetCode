import java.util.*;
class Solution {
    public String removeDuplicates(String s) {
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(!st.isEmpty()&&st.peek()==ch){
                st.pop();
            }
            else{
                st.push(ch);
            }
        }

        StringBuffer sb=new StringBuffer("");
        while(!st.isEmpty()){
            sb.append(st.pop());
        }

        String ans=sb.reverse().toString();
        return ans;

    }
}