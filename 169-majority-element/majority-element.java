import java.util.*;
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
            map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }

        int size=nums.length;
        for(Integer x:map.keySet()){
            if(map.get(x)>size/2){
                return x;
            }
        }
       return -1;
    }
}