class Solution {
    public boolean arrayStringsAreEqual(String[] s1, String[] s2) {
    StringBuffer sb1=new StringBuffer("");
	StringBuffer sb2=new StringBuffer("");
	for(int i=0;i<s1.length;i++) {
		sb1.append(s1[i]);
	}
	for(int i=0;i<s2.length;i++) {
		sb2.append(s2[i]);
	}
	if(sb1.toString().equals(sb2.toString())) {
		//System.out.println(true);
        return true;
	}
    return false;
    }
}