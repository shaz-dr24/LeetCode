import java.util.*;
class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
        }
        int ans=0;
        int odd=0;
        for(Integer x: map.values()){
            if(x%2==0){
                ans=ans+x;
            }
            else{
                ans=ans+(x-1);
                odd=odd+1;
            }
        }
        if(odd>0){
          ans=ans+1;
        }
        return ans;
    }
}