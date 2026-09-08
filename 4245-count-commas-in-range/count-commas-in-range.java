class Solution {
    public int countCommas(int num) {
        	  int count=0;
	if(num>=0&&num<=999) {
		//System.out.println(0);
        return 0;
	}
	else if(num>999) {
      
		for(int i=1000;i<=num;i++) {
			count=count+1;
		}
		//System.out.println(count);
        //return count;
	}
	return count;
    }
}