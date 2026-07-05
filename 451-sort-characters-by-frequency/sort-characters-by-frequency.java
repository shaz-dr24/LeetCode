import java.util.*;

class Solution {
    public String frequencySort(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        // Count frequency
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        StringBuilder sb = new StringBuilder();

        while (!map.isEmpty()) {

            int max = Collections.max(map.values());

            char maxChar = ' ';

            for (char ch : map.keySet()) {
                if (map.get(ch) == max) {
                    maxChar = ch;
                    break;
                }
            }

            for (int i = 0; i < max; i++) {
                sb.append(maxChar);
            }

            map.remove(maxChar);
        }

        return sb.toString();
    }
}