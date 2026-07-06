import java.util.*;

class Solution {
    public boolean wordPattern(String pattern, String s) {

        String[] arr = s.split(" ");

        if (pattern.length() != arr.length) {
            return false;
        }

        HashMap<Character, String> map1 = new HashMap<>();
        HashMap<String, Character> map2 = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {

            char c1 = pattern.charAt(i);
            String s1 = arr[i];

            if ((map1.containsKey(c1) && !map1.get(c1).equals(s1)) ||
                (map2.containsKey(s1) && map2.get(s1) != c1)) {
                return false;
            }

            map1.put(c1, s1);
            map2.put(s1, c1);
        }

        return true;
    }
}