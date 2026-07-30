import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
	HashSet<Integer>set=new HashSet<>();
	HashSet<Integer>set2=new HashSet<>();
	for(int i=0;i<nums1.length;i++) {
		set.add(nums1[i]);
	}
	for(int i=0;i<nums2.length;i++) {
		set2.add(nums2[i]);
	}
//	System.out.println(set);
//	System.out.println(set2);
	
	int [] arr1=new int[set.size()];
	int[] arr2=new int[set2.size()];
	int i=0;
	for(Integer x: set) {
		arr1[i]=x;
		i++;
	}
	//System.out.println(Arrays.toString(arr1));
	int j=0;
	for(Integer x: set2) {
		arr2[j]=x;
		j++;
	}
	ArrayList<Integer> al=new ArrayList<>();
	for(int k=0;k<arr1.length;k++) {
		
		for(int l=0;l<arr2.length;l++) {
			if(arr2[l]==arr1[k]) {
				al.add(arr2[l]);
			}
		}
	}
	int[]res=new int[al.size()];
    for(int z=0;z<al.size();z++){
        res[z]=al.get(z);
    }
    return res;
    }
}