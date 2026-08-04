class Solution {
    public int reverseBits(int num) {
        String binnum=Integer.toBinaryString(num);
	int tot=32;
	StringBuffer sb=new StringBuffer("");
	int diff=32-binnum.length();
	String zero="0";
	sb.append(zero.repeat(diff));
	sb.append(binnum);
	String rev=sb.reverse().toString();
	int fin=Integer.parseInt(rev,2);
	//System.out.println(fin);
    return fin;
    }
}