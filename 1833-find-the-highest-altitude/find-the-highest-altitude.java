import java.util.*;
class Solution {
    public int largestAltitude(int[] gain) {
        ArrayList<Integer>al=new ArrayList<>();
       // al.add(0);
        int [] arr=new int[gain.length+1];
       // arr[0]=0;
       // arr[1]=gain[0];
       int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
         int sum=0;
         for(int j=0;j<i;j++){
            sum=sum+gain[j];
         }
         al.add(sum);
        }
       // int j=1;
        for(int i=0;i<arr.length;i++){
            arr[i]=al.get(i);
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}