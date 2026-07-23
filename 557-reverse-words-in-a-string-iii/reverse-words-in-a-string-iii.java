class Solution {
    public String reverseWords(String s) {
        	String []arr=s.split(" ");
	String [] ans=new String[arr.length];
	for(int i=0;i<arr.length;i++) {
		ans[i]=reverse1(arr[i]);
	}
	StringBuffer sb=new StringBuffer("");
	for(int i=0;i<ans.length;i++) {
		sb.append(ans[i]+" ");
	}
	sb.deleteCharAt(sb.length()-1);
	return sb.toString();

}

public static String reverse1(String s) {
	StringBuffer sb=new StringBuffer(s);
	return sb.reverse().toString();
}
    }
