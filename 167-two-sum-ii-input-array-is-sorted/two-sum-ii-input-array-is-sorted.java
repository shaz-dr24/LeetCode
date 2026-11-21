
import java.util.*;

class Solution {
    public int[] twoSum(int[] numbers, int target) {

        ArrayList<Integer> al = new ArrayList<>();

        int i = 0;
        int j = numbers.length - 1;

        while(i < j) {

            if(numbers[i] + numbers[j] == target) {

                al.add(i + 1);
                al.add(j + 1);

                break;
            }
            else if(numbers[i] + numbers[j] > target) {

                j = j - 1;
            }
            else {

                i = i + 1;
            }
        }

        int[] ans = new int[al.size()];

        for(int k = 0; k < al.size(); k++) {

            ans[k] = al.get(k);
        }

        return ans;
    }
}
