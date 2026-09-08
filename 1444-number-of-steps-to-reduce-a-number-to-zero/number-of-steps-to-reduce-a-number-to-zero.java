class Solution {
    public int numberOfSteps(int num) {
        	int count=0;
            if(num==0){
                return 0;
            }
	while(true) {
		if(num%2==0) {
			count++;
			num=num/2;
		}
		else if(num%2!=0) {
			num=num-1;
			count++;
			if(num == 0) {
				break;
			}
			num=num/2;
			count++;
		}
		if(num==0) {
			break;
		}
	}
    return count;
    }
}