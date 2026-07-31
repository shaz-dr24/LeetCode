import java.util.*;
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        	HashMap<Integer, Integer> map1=new HashMap<>();
	HashMap<Integer, Integer> map2=new HashMap<>();
	for(int i=0;i<nums1.length;i++) {
		if(map1.containsKey(nums1[i])) {
			map1.put(nums1[i], map1.get(nums1[i])+1);
		}
		else {
			map1.put(nums1[i],1);
		}
	}
	
	for(int i=0;i<nums2.length;i++) {
		if(map2.containsKey(nums2[i])) {
			map2.put(nums2[i], map2.get(nums2[i])+1);
		}
		else {
			map2.put(nums2[i],1);
		}
	}
	ArrayList<Integer>al=new ArrayList<>();
	for(Map.Entry<Integer, Integer> entry:map1.entrySet()) {
		int key=entry.getKey();
		int val1=entry.getValue();
		if(map2.containsKey(key)) {
			int val2=map2.get(key);
			int min=Math.min(val1, val2);
			while(min>0) {
				al.add(key);
				min--;
			}
		}
		
		
	}
    int[] res=new int[al.size()];
    for(int i=0;i<al.size();i++){
        res[i]=al.get(i);
    }
    return res;
    }
}