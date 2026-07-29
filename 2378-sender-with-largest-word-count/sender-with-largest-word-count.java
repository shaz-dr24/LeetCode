import java.util.*;
class Solution {
    public String largestWordCount(String[] messages, String[] senders) {
     HashMap<String, Integer> map=new HashMap<>();
     for(int i=0;i<messages.length;i++) {
    	 int words=messages[i].split(" ").length;
    	// System.out.println(words);
    	 if(map.containsKey(senders[i])) {
    		 map.put(senders[i],map.get(senders[i])+words);
    	 }
    	 else {
    		 map.put(senders[i],words);
    	 }
     }
     
     ArrayList<Map.Entry<String, Integer>>al=new ArrayList<>(map.entrySet());
     Collections.sort(al,(a,b) ->{
    		 if(a.getValue()!=b.getValue()) {
    			 return b.getValue()-a.getValue();
    		 }
    		 else {
    			 return b.getKey().compareTo(a.getKey());
    		 }
     }
    		 );
     
     LinkedHashMap<String,Integer>sortedmap=new LinkedHashMap<>();
     for(Map.Entry<String, Integer> entry:al) {
    	 sortedmap.put(entry.getKey(),entry.getValue());
     }
     
     
     
     //System.out.println(map);
     String s="";
     int max=0;
     for(Map.Entry<String, Integer> entry: sortedmap.entrySet()) {
    	 if(entry.getValue()>max) {
    		 max=entry.getValue();
    		 s=entry.getKey();
    	 }
     }
     return s;
    }
}