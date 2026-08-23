import java.util.*;
class Solution {
    public String customSortString(String order, String s) {
        	HashMap<Character, Integer> map=new HashMap<>();
	for(int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
		if(map.containsKey(ch)) {
			map.put(ch,map.get(ch)+1);
		}
		else {
			map.put(ch,1);
		}
	}
	
	StringBuffer sb=new StringBuffer("");
	for(int i=0;i<order.length();i++) {
		char ch=order.charAt(i);
		for(Map.Entry<Character, Integer> entry: map.entrySet()) {
			if(ch==entry.getKey()) {
	        	sb.append(entry.getKey().toString().repeat(entry.getValue()));
			}
		}
	}
	//System.out.println(sb);
	for(int i=0;i<order.length();i++) {
		char ch=order.charAt(i);
		map.remove(ch);
			
		
	}
	//System.out.println(map);
	for(Map.Entry<Character, Integer> entry: map.entrySet()) {
		sb.append(entry.getKey().toString().repeat(entry.getValue()));
	}
	//System.out.println(sb);
    return sb.toString();
    }
}