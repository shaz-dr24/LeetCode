import java.util.*;
class Solution {
    public String[] findRelativeRanks(int[] arr) {
	LinkedHashMap<Integer, Integer>map=new LinkedHashMap<>();
	for(int i=0;i<arr.length;i++) {
		map.put(arr[i], i+1);
	}
	System.out.println(map);
	
	PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
	for(int i=0;i<arr.length;i++) {
		pq.offer(arr[i]);
	}
	System.out.println(pq);
	int index=0;
	String [] res=new String[arr.length];
	while(!pq.isEmpty()) {
		int top=pq.poll();
		for(Map.Entry<Integer,Integer> entry : map.entrySet()) {

		    if(entry.getKey() == top) {

		        int pos = entry.getValue() - 1;

		        if(index == 0) {
		            res[pos] = "Gold Medal";
		        }
		        else if(index == 1) {
		            res[pos] = "Silver Medal";
		        }
		        else if(index == 2) {
		            res[pos] = "Bronze Medal";
		        }
		        else {
		            res[pos] = String.valueOf(index + 1);
		        }

		        index++;
		        break;
		    }
		}
	}
    return res;
    }
}