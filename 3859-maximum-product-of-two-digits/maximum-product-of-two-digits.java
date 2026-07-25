import java.util.*;
class Solution {
    public int maxProduct(int n) {
        ArrayList<Integer> al=new ArrayList<>();
        while(n>0){
            int d;
            d=n%10;
            al.add(d);
            n=n/10;
        }
        int [] arr=new int[al.size()];
        for(int i=0;i<arr.length;i++){
            arr[i]=al.get(i);
        }

        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int prod=1;
            for(int j=i+1;j<arr.length;j++){
                prod=arr[i]*arr[j];
                if(prod>max){
                    max=prod;
                }
            }
        }
return max;
    
    }
}