import java.util.*;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        int size = nums.length;
        int[] arr = new int[size];

        for (int i = 1; i <= size; i++) {
            arr[i - 1] = i;
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> al = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], 1);
        }

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.get(nums[i]) + 1);
        }

        for (Integer x : map.keySet()) {
            if (map.get(x) == 1) {
                al.add(x);
            }
        }

        return al;
    }
}