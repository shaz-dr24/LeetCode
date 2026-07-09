import java.util.*;
class Solution {
    public boolean checkIfPangram(String sentence) {
        HashSet<Character>set=new HashSet<>();
        for(char i='a';i<='z';i++){
            set.add(i);
        }
int count=26;
        char [] ch=sentence.toCharArray();
        for(int i=0;i<sentence.length();i++){
            if(set.contains(ch[i])){
                count=count-1;
                set.remove(ch[i]);
            }
        }
        if(count==0){
            return true;
        }
        return false;
    }
}