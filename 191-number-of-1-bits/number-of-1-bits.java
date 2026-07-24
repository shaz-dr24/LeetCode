import java.util.*;
class Solution {
    public int hammingWeight(int n) {
        String s=Integer.toBinaryString(n);
        //int num=Integer.parseInt(s);
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='1'){
                count=count+1;
            }
        }
        return count;
    }
}