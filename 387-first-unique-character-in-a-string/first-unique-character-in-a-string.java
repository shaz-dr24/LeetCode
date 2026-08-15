import java.util.*;
class Solution {
    public int firstUniqChar(String s) {
        	LinkedHashMap<Character, Integer> map=new LinkedHashMap<>();
	for(int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
		if(map.containsKey(ch)) {
			map.put(ch, map.get(ch)+1);
		}
		else {
			map.put(ch,1);
		}
	}
	//System.out.println(map);
	char ch=' ';
	for(Map.Entry<Character, Integer> entry: map.entrySet()) {
		if(entry.getValue()==1) {
			ch=entry.getKey();
			break;
		}
	}
	//System.out.println(ch);
	
	for(int i=0;i<s.length();i++) {
		char chh=s.charAt(i);
		if(ch==chh) {
			//System.out.println(i);
			return i;
		}
       
	}
    return -1;
    }
}