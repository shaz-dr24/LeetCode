import java.util.*;
class Solution {
    public int halveArray(int[] arr) {
        	int count=0;
	double sum=0;
	for(int i=0;i<arr.length;i++) {
		sum=sum+arr[i];
	}
	double half=sum/2;
	PriorityQueue<Double> pq=new PriorityQueue<>(Collections.reverseOrder());
	for(int i=0;i<arr.length;i++) {
		pq.offer((double)arr[i]);
	}
	
	while(true) {
		//double psum=0;
		// for(Double x: pq) {
		// psum=psum+x;
	    // }
		if(sum>half) {
			double val=pq.poll();
			double valhalf=val/2;
			pq.offer(valhalf);
            sum=sum-valhalf;
			count=count+1;
		}
		else {
			break;
		}
	}
    return count;
    }
}