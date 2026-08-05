import java.util.*;
class Solution {
    public String frequencySort(String s) {
        	HashMap<Character, Integer> map=new HashMap<>();
	for(int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
		if(map.containsKey(ch)) {
			map.put(ch, map.get(ch)+1);
		}
		else {
			map.put(ch,1);
		}
	}
	
	ArrayList<Map.Entry<Character, Integer>> al=new ArrayList<>(map.entrySet());
	Collections.sort(al, (a,b)->{
		if(b.getValue()!=a.getValue()) {
			return b.getValue()-a.getValue();
		}
		else {
			return a.getKey().compareTo(b.getKey());
		}
	});
	
	LinkedHashMap<Character, Integer> sortedmap=new LinkedHashMap<>();
	for(Map.Entry<Character, Integer>entry: al) {
		sortedmap.put(entry.getKey(),entry.getValue());
	}
	//System.out.println(sortedmap);
	
	StringBuffer sb=new StringBuffer("");
	for(Map.Entry<Character, Integer> entry: sortedmap.entrySet()) {
			sb.append(String.valueOf(entry.getKey()).repeat(entry.getValue()));
	}
    return sb.toString();
    }
}