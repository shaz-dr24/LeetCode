import java.util.*;
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        ArrayList<Integer> al=new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue()>1){
                al.add(entry.getKey());
            }
        }
        return al;
    }
}