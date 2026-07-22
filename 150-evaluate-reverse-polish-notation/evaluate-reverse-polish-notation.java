import java.util.*;
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String>st=new Stack<>();
        for(int i=0;i<tokens.length;i++){
            if(!st.isEmpty()&&tokens[i].equals("+")){
                String a=st.pop();
                String b=st.pop();
                int val1=Integer.parseInt(a);
                int val2=Integer.parseInt(b);
                int ans=val1+val2;
                String anss=String.valueOf(ans);
                st.push(anss);
            }
            else if(!st.isEmpty()&&tokens[i].equals("-")){
                String a=st.pop();
                String b=st.pop();
                int val1=Integer.parseInt(a);
                int val2=Integer.parseInt(b);
                int ans=val2-val1;
                String anss=String.valueOf(ans);
                st.push(anss);
            }
            else if(!st.isEmpty()&&tokens[i].equals("*")){
                String a=st.pop();
                String b=st.pop();
                int val1=Integer.parseInt(a);
                int val2=Integer.parseInt(b);
                int ans=val1*val2;
                String anss=String.valueOf(ans);
                st.push(anss);
            }
            else if(!st.isEmpty()&&tokens[i].equals("/")){
                String a=st.pop();
                String b=st.pop();
                int val1=Integer.parseInt(a);
                int val2=Integer.parseInt(b);
                int ans=val2/val1;
                String anss=String.valueOf(ans);
                st.push(anss);
            }
            else{
                st.push(tokens[i]);
            }
        }
int ans=0;
        while(!st.isEmpty()){
       ans=ans+Integer.parseInt(st.pop());
        }
        //int result=Integer.parseInt(ans);
        return ans;
    }
}