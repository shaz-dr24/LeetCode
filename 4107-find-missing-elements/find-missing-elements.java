class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        	Arrays.sort(nums);
	ArrayList<Integer> al=new ArrayList<>();
	ArrayList<Integer> fin=new ArrayList<>();
	for(int i=0;i<nums.length;i++) {
		al.add(nums[i]);
	}
	
	int first=al.get(0);
	int last=al.get(al.size()-1);
	for(int i=first;i<=last;i++) {
		if(!al.contains(i)) {
			fin.add(i);
		}
	}
    return fin;
    }
}