import java.util.*;
class Solution {
    public String[] sortPeople(String[] names, int[] height) {
        	HashMap<Integer, String>map=new HashMap<>();
	for(int i=0;i<names.length;i++) {
		map.put(height[i], names[i]);
	}
	//System.out.println(map);
	
	ArrayList<Map.Entry<Integer,String>> al=new ArrayList<>(map.entrySet());
	Collections.sort(al,(a,b)->{
		if(b.getKey()!=a.getKey()) {
			return b.getKey()-a.getKey();
		}
		else {
			return a.getValue().compareTo(b.getValue());
		}
	});
	LinkedHashMap<Integer, String> sortedmap=new LinkedHashMap<>();
	for(Map.Entry<Integer, String> entry: al) {
		sortedmap.put(entry.getKey(), entry.getValue());
	}
	//System.out.println(sortedmap);
	ArrayList<String> res=new ArrayList<>();
	for(Map.Entry<Integer, String>entry: sortedmap.entrySet()) {
		res.add(entry.getValue());
	}
	System.out.println(res);
	String [] arr=new String[res.size()];
	for(int i=0;i<res.size();i++) {
		arr[i]=res.get(i);
	}
    return arr;
    }
}