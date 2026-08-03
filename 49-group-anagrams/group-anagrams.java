import java.util.*;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char[] ch=strs[i].toCharArray();
            Arrays.sort(ch);
            String key=new String(ch);
            if(map.containsKey(key)){
                map.get(key).add(strs[i]);
            }
            else{
                ArrayList<String> al=new ArrayList<>();
                al.add(strs[i]);
                map.put(key, al);
            }
        }
       List<List<String>> ans = new ArrayList<>();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            ans.add(entry.getValue());
        }
        return ans;
    }
}