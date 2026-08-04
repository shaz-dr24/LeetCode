import java.util.*;
class Solution {
    public int findComplement(int num) {
        String binnum=Integer.toBinaryString(num);
        StringBuffer sb=new StringBuffer("");
        for(int i=0;i<binnum.length();i++){
            char ch=binnum.charAt(i);
            if(ch=='0'){
                sb.append('1');
            }
            else{
                sb.append('0');
            }
        }
        int finalnum=Integer.parseInt(sb.toString(), 2);
        return finalnum;
    }
}