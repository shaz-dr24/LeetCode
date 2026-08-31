import java.util.*;
import java.math.*;
class Solution {
    public int getLucky(String s, int k) {
	StringBuffer sb=new StringBuffer("");
	for(int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
		if(ch>='a'&&ch<='z') {
			sb.append(ch-'a'+1);
		}
	}
	BigInteger num=new BigInteger(sb.toString());
	

	while(k>0) {
		num=sumNum(num);
		k--;
	}
	//System.out.println(num.intValue());
    return num.intValue();
}
public static BigInteger sumNum(BigInteger num) {
	BigInteger sum=BigInteger.ZERO;
	while(num.compareTo(BigInteger.ZERO)>0) {
		BigInteger d=num.remainder(BigInteger.TEN);
		sum=sum.add(d);
		num=num.divide(BigInteger.TEN);
	}
	return sum;
}
}