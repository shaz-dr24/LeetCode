import java.util.*;
class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        	ArrayList<String> al=new ArrayList<>();
	for(int i=0;i<s.length();i++) {
		
		for(int j=i+1;j<=s.length();j++) {
			String sub=s.substring(i,j);
			int count=0;
			for(int x=0;x<sub.length();x++) {
				char ch=sub.charAt(x);
				if(ch=='1') {
					count=count+1;
				}
				
			}
			if(count==k) {
				al.add(sub);
			}
		}
	}
	//System.out.println(al);
	HashMap<String, Integer> map=new HashMap<>();
	for(int i=0;i<al.size();i++) {
		map.put(al.get(i), al.get(i).length());
	}
	//System.out.println(map);
	int min = Integer.MAX_VALUE;
    String ans = "";
    // Find shortest substring
    for (Map.Entry<String, Integer> entry : map.entrySet()) {
        String sub = entry.getKey();
        int length = entry.getValue();
        if (length < min) {
            min = length;
            ans = sub;
        }
        // Same length → lexicographically smaller
        else if (length == min && sub.compareTo(ans) < 0) {
            ans = sub;
        }
    }
    return ans;
    }
}