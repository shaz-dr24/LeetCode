class Solution {
    public int maxRepeating(String sequence, String word) {
        int count=0;
        String temp=word;
        while(sequence.contains(temp)){
            count=count+1;
            temp=temp+word;
        }
        return count;
    }
}