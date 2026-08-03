import java.util.*;
class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
        }

        int evesum=0;
        int oddsum=0;
        boolean oddPresent=false;
        for(Map.Entry<Character, Integer> entry: map.entrySet()){
            if(entry.getValue()%2==0){
                evesum=evesum+entry.getValue();

            }
            else{
                oddsum=oddsum+(entry.getValue()-1);
                oddPresent=true;
            }
        }
        int ans=evesum+oddsum;
        if(oddPresent){
            return ans+1;
        }
        return ans;
    }
}