import java.util.*;
class Solution {
    public int lastStoneWeight(int[] arr) {
	PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
	for(int i=0;i<arr.length;i++) {
		pq.offer(arr[i]);
	}

	while(pq.size()>1) {
	int first=pq.poll();
	int second=pq.poll();
	
	if(first!=second) {
		int sub=first-second;
	pq.offer(sub);
	}
	}
	if(pq.size()==0) {
		return 0;
	}
	else {
		return pq.peek();
	}
    }
}