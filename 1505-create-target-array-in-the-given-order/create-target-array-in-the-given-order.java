import java.util.*;
class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        	ArrayList<Integer> al=new ArrayList<>();
	int i=0;
	int j=0;
	while(i<nums.length&&j<index.length) {
		al.add(index[j],nums[i]);
		i++;
		j++;
	}
    int[] res=new int[al.size()];
    for(int k=0;k<al.size();k++){
        res[k]=al.get(k);
    }
    return res;
    }
}