import java.util.*;
class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
	HashMap<Integer,Integer> map=new HashMap<>();
	for(int i=0;i<arr1.length;i++) {
		if(map.containsKey(arr1[i])) {
			map.put(arr1[i], map.get(arr1[i])+1);
		}
		else {
			map.put(arr1[i], 1);
		}
	}
	ArrayList<Integer> al=new ArrayList<>();
	for(int i=0;i<arr2.length;i++) {
		
		for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
			if(arr2[i]==entry.getKey()) {
				for(int j=0;j<entry.getValue();j++) {
					al.add(entry.getKey());
				}
			}
		}
	}
	
	for(int i=0;i<arr2.length;i++) {
		//for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
			//if(arr2[i]==entry.getKey()) {
				map.remove(arr2[i]);
		//	}
		//}
	}
	ArrayList<Integer> al2=new ArrayList<>();
	//System.out.println(map);
	for(Map.Entry<Integer,Integer>entry: map.entrySet()) {
		for(int i=0;i<entry.getValue();i++) {
			al2.add(entry.getKey());
		}
	}
	Collections.sort(al2);
	al.addAll(al2);
	//System.out.println(al);
    int [] res=new int[al.size()];
    for(int i=0;i<al.size();i++){
        res[i]=al.get(i);
    }
    return res;
    }
}