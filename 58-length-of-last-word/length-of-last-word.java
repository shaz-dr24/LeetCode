class Solution {
    public int lengthOfLastWord(String s) {
        char []c=s.toCharArray();
        int count=0;
        for(int i=c.length-1;i>=0;i--){
            if(c[i]==' '&&count>0){
                break;
            }
            if(c[i]!=' '){
                count=count+1;
            }
        }
        return count;
    }
}