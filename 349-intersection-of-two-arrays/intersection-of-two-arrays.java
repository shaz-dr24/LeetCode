import java.util.*;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            set1.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            set2.add(nums2[i]);
        }

        ArrayList<Integer> al=new ArrayList<>();
        for(Integer x: set2){
            if(set1.contains(x)){
                al.add(x);
            }
        }

        int [] res=new int[al.size()];
        for(int i=0;i<al.size();i++){
            res[i]=al.get(i);
        }
        return res;
    }
}