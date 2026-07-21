class Solution {
    public int countSegments(String s) {
        int count=0;
         String [] str=s.split(" ");
          if(s.length()==0){
                return 0;
            }
        for(int i=0;i<str.length;i++){
        if(str[i].length()==0){
            continue;
        }else{
            count++;
        }
    }
        return count;
    }
}