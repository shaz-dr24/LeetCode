class Solution {
    public int lengthOfLastWord(String s) {
        String word=s.trim();
        char []c=word.toCharArray();
        int count=0;
        for(int i=c.length-1;i>=0;i--){
            if(c[i]==' '){
                break;
            }
            if(c[i]!=' '){
                count=count+1;
            }
        }
        return count;
    }
}