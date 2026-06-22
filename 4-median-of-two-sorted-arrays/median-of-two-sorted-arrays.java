import java.util.*;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int size1=nums1.length;
        int size2=nums2.length;
        int total=size1+size2;
        int [] temp=new int[total];
        for(int i=0;i<nums1.length;i++){
            temp[i]=nums1[i];
        }
        int k=nums1.length;
        for(int j=0;j<nums2.length;j++){
            temp[k++]=nums2[j];
        }
        Arrays.sort(temp);
        int start=0;
        int size=temp.length;
        if(size%2!=0){
            return temp[size/2];
        }
        else if(size%2==0){
            int mid=size/2;
            int lmid=(size/2)-1;
            double median=(temp[mid]+temp[lmid])/2.0;
            return median;
        }
        else{
            return 0;
        }
    }
}