import java.util.*;
class Solution {
    public String reverseVowels(String s) {
        if(s.length() == 0) {
            return s;
        }
        char[] ch = s.toCharArray();
        StringBuffer sb = new StringBuffer("");
        for(int i = 0; i < ch.length; i++) {
            if(ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U'||
               ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
                sb.append(ch[i]);
            }
        }
        char[] temp = sb.reverse().toString().toCharArray();
        if(temp.length == 0) {
            return s;
        }
        for(int i = 0; i < ch.length; i++) {

            if(ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U'||
               ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {

                ch[i] = '#';
            }
        }

        int k = 0;

        for(int i = 0; i < ch.length; i++) {

            if(ch[i] == '#') {

                ch[i] = temp[k];
                k++;
            }
        }


        return new String(ch);
    }
}