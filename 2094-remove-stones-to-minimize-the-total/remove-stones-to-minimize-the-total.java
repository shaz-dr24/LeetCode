import java.util.*;
class Solution {
    public int minStoneSum(int[] arr, int k) {
        	PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
	for(int i=0;i<arr.length;i++) {
		pq.offer(arr[i]);
	}
	while(k>0) {
	int val=pq.poll();
	int ans=val-(val/2);
	pq.offer(ans);
	k--;
	}
	//System.out.println(pq);
	int i=0;
	int [] res=new int[pq.size()];
	while(!pq.isEmpty()) {
		res[i]=pq.poll();
		i=i+1;
	}
	//System.out.println(Arrays.toString(res));
	int sum=0;
	for(int j=0;j<res.length;j++) {
		sum=sum+res[j];
	}
    return sum;
    }
}