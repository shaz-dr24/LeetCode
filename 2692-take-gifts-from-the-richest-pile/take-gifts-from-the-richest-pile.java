import java.util.*;
class Solution {
    public long pickGifts(int[] arr, int k) {
        	PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
	for(int i=0;i<arr.length;i++) {
	    pq.offer(arr[i]);
	}
	while(k>0) {
		int val=pq.poll();
		int sqval=(int)Math.sqrt(val);
		pq.offer(sqval);
		k=k-1;
	}
	//System.out.println(pq);
	int i=0;
	int [] res=new int[pq.size()];
	while(!pq.isEmpty()) {
		res[i]=pq.poll();
		i++;
	}
	//System.out.println(Arrays.toString(res));
	long sum=0;
	for(int j=0;j<res.length;j++) {
		sum=sum+res[j];
	}
    return sum;
    }
}