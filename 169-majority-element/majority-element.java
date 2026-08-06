import java.util.*;
class Solution {
    public int majorityElement(int[] arr) {
	HashMap<Integer, Integer> map=new HashMap<>();
	for(int i=0;i<arr.length;i++) {
		if(map.containsKey(arr[i])) {
			map.put(arr[i],map.get(arr[i])+1);
		}
		else {
			map.put(arr[i],1);
		}
	}
	
	int max=Integer.MIN_VALUE;
	int key=0;
	for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
		if(entry.getValue()>max) {
			max=entry.getValue();
			key=entry.getKey();
		}
		
	}

    //     int size=nums.length;
    //     for(Integer x:map.keySet()){
    //         if(map.get(x)>size/2){
    //             return x;
    //         }
    //     }
    //    return -1;
    return key;

    }
}