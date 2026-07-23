import java.util.*;
class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        s = s.replaceAll(" +", " ");
        String [] arr=s.split(" ");
        String [] ans=new String[arr.length];
        int j=0;
        for(int i=arr.length-1;i>=0;i--) {
            ans[j]=arr[i];
            j=j+1;
        }
        StringBuffer sb=new StringBuffer ("");
        for(int i=0;i<ans.length;i++) {
            sb.append(ans[i]+" ");
        }
        sb.deleteCharAt(sb.length() - 1);
       return sb.toString();
    }
}