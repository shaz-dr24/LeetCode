import java.util.*;
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>
        (new Comparator<Integer>() {
                @Override
                public int compare(Integer a, Integer b) {
                    return map.get(b) - map.get(a);
                }
            }
        );
        for (Integer x : map.keySet()) {
            pq.offer(x);
        }
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            al.add(pq.poll());
        }
        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = al.get(i);
        }
        return ans;
    }
}