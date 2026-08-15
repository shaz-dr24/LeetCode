import java.util.*;
class Solution {
    public String mergeAlternately(String word1, String word2) {
    char [] ch1=word1.toCharArray();
	char [] ch2=word2.toCharArray();
	StringBuffer sb=new StringBuffer("");
	int i=0;
	int j=0;
	while(i<ch1.length&&j<ch2.length) {
		sb.append(ch1[i]);
		sb.append(ch2[i]);
		i=i+1;
		j=j+1;
	}
	while(i<ch1.length) {
		sb.append(ch1[i]);
		i++;
	}
	while(j<ch2.length) {
		sb.append(ch2[j]);
		j++;
	}
    return sb.toString();
    }
}