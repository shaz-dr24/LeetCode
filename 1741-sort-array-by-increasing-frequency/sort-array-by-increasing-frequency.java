import java.util.*;
class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }

        ArrayList<Map.Entry<Integer, Integer>> al=new ArrayList<>(map.entrySet());
       // Collections.sort(al, (a,b)-> a.getValue()-b.getValue());
          Collections.sort(al,(a,b)->{

    if(a.getValue()!=b.getValue())
        return a.getValue()-b.getValue();

    return b.getKey()-a.getKey();

});
        LinkedHashMap <Integer, Integer> sortedmap=new LinkedHashMap<>();
        for(Map.Entry<Integer, Integer> entry: al){
            sortedmap.put(entry.getKey(), entry.getValue());
        } 
        ArrayList<Integer> ans=new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry:al){
            int num=entry.getKey();
            int freq=entry.getValue();
            while(freq>0){
                ans.add(num);
                freq=freq-1;
            }
        }
        int[] result=new int[ans.size()];
        for(int i=0;i<result.length;i++){
            result[i]=ans.get(i);
        }
        return result;
    }
}