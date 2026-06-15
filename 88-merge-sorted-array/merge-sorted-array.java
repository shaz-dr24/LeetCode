import java.util.*;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int size = m + n;
        int mergedArray[] = new int[size];

        for(int i = 0; i < m; i++) {
            mergedArray[i] = nums1[i];
        }

        for(int i = 0; i < n; i++) {
            mergedArray[m + i] = nums2[i];
        }

        Arrays.sort(mergedArray);

        for(int i = 0; i < size; i++) {
            nums1[i] = mergedArray[i];
        }
    }
}