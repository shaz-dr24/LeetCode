class Solution {
    public int lengthOfLastWord(String s) {
        String str = s.trim();
        String[] strarr = str.split(" ");
        String last=strarr[strarr.length-1];
        int lastCount=last.length();
        return lastCount;
    }
}