import java.util.*;
class Solution {
    public int largestInteger(int[] arr, int k) {
        int []temp=arr.clone();
        Arrays.sort(temp);
        int ans=Integer.MIN_VALUE;
        for(int x=0;x<temp.length;x++){
            int val=temp[x];
            int count=0;
            for(int i=0;i<=arr.length-k;i++){
                boolean flag=false;
                for(int j=i;j<i+k;j++){
                    if(arr[j]==val){
                        //count=count+1;
                        flag=true;
                        break;
                    }
                }
                if(flag){
                     count=count+1;
                }
            }
            if(count==1){
                ans=Math.max(val, ans);
            }
        }
        if(ans==Integer.MIN_VALUE){
            return -1;
        }
        return ans;
    }
}