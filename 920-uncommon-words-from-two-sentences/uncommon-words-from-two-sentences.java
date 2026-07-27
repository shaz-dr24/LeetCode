import java.util.*;
class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        	String[] arr1=s1.split(" ");
	String [] arr2=s2.split(" ");
	HashMap<String, Integer>map=new HashMap<>();
	for(int i=0;i<arr1.length;i++) {
		if(map.containsKey(arr1[i])) {
			map.put(arr1[i], map.get(arr1[i])+1);
		}
		else {
			map.put(arr1[i],1);
		}
	}
	
	for(int i=0;i<arr2.length;i++) {
		if(map.containsKey(arr2[i])) {
			map.put(arr2[i], map.get(arr2[i])+1);
		}
		else {
			map.put(arr2[i],1);
		}
	}
	ArrayList<String> al=new ArrayList<>();
	for(Map.Entry<String, Integer> entry: map.entrySet()) {
		if(entry.getValue()==1) {
			al.add(entry.getKey());
		}
	}
	String[] ans=new String[al.size()];
	return al.toArray(ans); 
    }
}