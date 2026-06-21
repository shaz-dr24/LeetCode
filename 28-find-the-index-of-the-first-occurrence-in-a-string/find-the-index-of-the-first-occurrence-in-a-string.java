class Solution {
    public static int strStr(String haystack, String needle) {

    char[] c = haystack.toCharArray();

    for(int i = 0; i < c.length; i++) {

        if(haystack.startsWith(needle, i)) {
            return i;
        }
    }

    return -1;
}
}