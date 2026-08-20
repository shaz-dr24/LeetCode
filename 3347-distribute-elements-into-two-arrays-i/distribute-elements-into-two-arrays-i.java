import java.util.*;
class Solution {
    public int[] resultArray(int[] arr) {
        	ArrayList<Integer>  al1=new ArrayList<>();
	ArrayList<Integer> al2=new ArrayList<>();
	al1.add(arr[0]);
	al2.add(arr[1]);
	for(int i=2;i<arr.length;i++) {
		if(al1.get(al1.size()-1)>al2.get(al2.size()-1)) {
		    al1.add(arr[i]);
		}
		else {
			al2.add(arr[i]);
		}
	}
	ArrayList<Integer> res=new ArrayList<>();
	for(int i=0;i<al1.size();i++) {
		res.add(al1.get(i));
	}
	for(int i=0;i<al2.size();i++) {
		res.add(al2.get(i));
	}
	//System.out.println(res);
	int [] ans=new int[res.size()];
	for(int i=0;i<res.size();i++) {
		ans[i]=res.get(i);
	}
    return ans;
    }
}