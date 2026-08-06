import java.util.*;
class Solution {
    public List<Integer> majorityElement(int[]arr) {
        	HashMap<Integer, Integer>map=new HashMap<>();
	for(int i=0;i<arr.length;i++) {
		if(map.containsKey(arr[i])) {
			map.put(arr[i], map.get(arr[i])+1);
		}
		else {
			map.put(arr[i], 1);
		}
	}
	ArrayList<Integer>al=new ArrayList<>();
	int n=arr.length;
	for(Map.Entry<Integer, Integer>entry:map.entrySet()) {
		if(entry.getValue()>(n/3)) {
			al.add(entry.getKey());
		}
	}
    return al;
    }
}