import java.util.*;
class Solution {
    public int divisorSubstrings(int num, int k) {
    int count=0;
	String s=String.valueOf(num);
	for(int i=0;i<=s.length()-k;i++) {
		for(int j=i+1;j<=i+k;j++) {
			String sub=s.substring(i,j);
			//System.out.println(sub);
			if(sub.length()==k) {
				int val=Integer.parseInt(sub);
				if(val!=0&&num%val==0) {
					count=count+1;
				}
			}
		}
	}
    return count;
    }
}