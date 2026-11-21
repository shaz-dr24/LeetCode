import java.util.*;
class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        int total=0;
        Arrays.sort(seats);
        Arrays.sort(students);
        if(seats.length!=students.length){
            return 0;
        }
        else{
            int i=0;
            int j=0;
            while(i<seats.length&&j<seats.length){
                int diff=Math.abs(students[j]-seats[i]);
                total=total+diff;
                i=i+1;
                j=j+1;
            }
        }
        return total;
    }
}