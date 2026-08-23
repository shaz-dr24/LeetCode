import java.util.*;
class Solution {
    public int alternateDigitSum(int num) {
        	String number=String.valueOf(num);
	StringBuffer sb1=new StringBuffer("");
	StringBuffer sb2=new StringBuffer("");
	for(int i=0;i<number.length();i=i+2) {
		char ch=number.charAt(i);
		sb1.append(ch);
	}
	for(int i=1;i<number.length();i=i+2) {
		char ch=number.charAt(i);
		sb2.append(ch);
		
	}
	//System.out.println(sb2);
	long val1=Integer.parseInt(sb1.toString());
	long val2=0;
        if (sb2.length() > 0) {
            val2 = Integer.parseInt(sb2.toString());
        }
	int ans1=sumNum(val1);
	int ans2=-sumNum(val2);
    return ans1+ans2;
    }
    public static int sumNum(long num) {
	int sum=0;
	while(num>0) {
		int d;
		d=(int)num%10;
		sum=sum+d;
		num=num/10;
	}
	return sum;
}
}
