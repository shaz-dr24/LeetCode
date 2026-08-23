import java.util.*;
class Solution {
    public int[] arrayRankTransform(int[] arr) {
        	HashSet<Integer> set=new HashSet<>();
	for(int i=0;i<arr.length;i++) {
		set.add(arr[i]);
	}
	int [] res=new int[set.size()];
	int i=0;
	for(Integer x: set) {
	    res[i]=x;
	    i++;
	}
	Arrays.sort(res);
	//System.out.println(Arrays.toString(res));
	LinkedHashMap<Integer,Integer>map=new LinkedHashMap<>();
	for(int j=0;j<res.length;j++) {
		map.put(res[j],j+1);
	}
	//System.out.println(map);
	ArrayList<Integer> al=new ArrayList<>();
	//int x=0;
	for(int k=0;k<arr.length;k++) {
	//     for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
	// 	if(arr[k]==entry.getKey()) {
	// 		al.add(entry.getValue());
	// 	}
		
	// }
    al.add(map.get(arr[k]));
	}
	//System.out.println(al);
	int []ans=new int[al.size()];
	for(int s=0;s<al.size();s++) {
		ans[s]=al.get(s);
	}
	//System.out.println(Arrays.toString(ans));
    return ans;
    }
}