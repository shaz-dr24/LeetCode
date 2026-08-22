import java.util.*;
class Solution {
    public int[] topKFrequent(int[] arr, int k) {
        	HashMap<Integer,Integer> map=new HashMap<>();
	for(int i=0;i<arr.length;i++) {
		if(map.containsKey(arr[i])) {
			map.put(arr[i], map.get(arr[i])+1);
		}
		else {
			map.put(arr[i],1);
		}
	}
	//System.out.println(map);
	ArrayList<Map.Entry<Integer, Integer>>al=new ArrayList<>(map.entrySet());
	Collections.sort(al,(a,b)->{
		if(a.getValue()!=b.getValue()) {
			return b.getValue()-a.getValue();
		}
		else {
			return b.getKey().compareTo(a.getKey());
		}
	});
	LinkedHashMap<Integer, Integer> sortedmap=new LinkedHashMap<>();
	for(Map.Entry<Integer, Integer> entry: al) {
		sortedmap.put(entry.getKey(), entry.getValue());
	}
	System.out.println(sortedmap);
	ArrayList<Integer> res=new ArrayList<>();
	for(Map.Entry<Integer,Integer> entry:sortedmap.entrySet()) {
		if(k>0) {
			res.add(entry.getKey());
			k--;
		}
		else {
			break;
		}
	}
	Collections.reverse(res);
	//System.out.println(res);
	int [] ans=new int[res.size()];
	for(int i=0;i<res.size();i++) {
		ans[i]=res.get(i);
	}
	//System.out.println(Arrays.toString(ans));
    return ans;
    }
}