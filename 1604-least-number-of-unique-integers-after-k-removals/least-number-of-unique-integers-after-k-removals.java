import java.util.*;
class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }
            else{
                map.put(arr[i], 1);
            }
        }

        // ArrayList<Integer> al=new ArrayList<>();
        // Collections.sort(al);
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
             pq.offer(entry.getValue());
         }
        while(k>0&&!pq.isEmpty()){
            int top=pq.peek();
            if(k>=top){
                k=k-top;
                pq.poll();
            }
            else{
                break;
            }
        }
        return pq.size();
    }
}