import java.util.*;
class Solution {
    public String reorganizeString(String s) {
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
	PriorityQueue<Map.Entry<Character, Integer>> pq=new PriorityQueue<>((a,b)->{
	if(b.getValue()!=a.getValue()) {
		return b.getValue()-a.getValue();
	}
	else {
		return a.getKey().compareTo(b.getKey());
	}});
	
	for(Map.Entry<Character, Integer> entry: map.entrySet()) {
		pq.offer(entry);
	}
	
	StringBuffer sb=new StringBuffer("");
	Map.Entry<Character, Integer> prev=null;
	while(!pq.isEmpty()) {
		Map.Entry<Character,Integer> curr=pq.poll();
		sb.append(curr.getKey());
		curr.setValue(curr.getValue()-1);
		if(prev!=null&&prev.getValue()>0) {
			pq.offer(prev);
		}
		prev=curr;
	}
	
	if(s.length()!=sb.length()) {
		return "";
	}
	return sb.toString();
	
    }
}