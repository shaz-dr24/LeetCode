import java.util.*;
class Solution {
    public int[] findErrorNums(int[] arr) {
        	HashMap<Integer, Integer> map=new HashMap<>();
	for(int i=0;i<arr.length;i++) {
		if(map.containsKey(arr[i])) {
			map.put(arr[i], map.get(arr[i])+1);
		}
		else {
			map.put(arr[i],1);
		}
	}
	
	int max=Integer.MIN_VALUE;
	for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
		if(entry.getValue()==2) {
			max=entry.getKey();
		}
	}
	
	HashSet<Integer> set=new HashSet<>();
	int sum=0;
	for(int i=0;i<arr.length;i++) {
		set.add(arr[i]);
	}
	for(Integer x:set) {
		sum=sum+x;
	}
	
	//System.out.println(sum);
	int size=set.size()+1;
	int val=(size*(size+1))/2;
	int ans=val-sum;
	//System.out.println(ans);
	int [] res= {max,ans};
    return res;
    }
}