import java.util.*;
class Solution {
    public int maximumPopulation(int[][] logs) {
        	HashMap<Integer,Integer> map=new HashMap<>();
	for(int i=0;i<logs.length;i++) {
		int start=logs[i][0];
		int end=logs[i][1];
		for(int j=start;j<end;j++) {
			if(map.containsKey(j)) {
				map.put(j, map.get(j)+1);
			}
			else {
				map.put(j,1);
			}
		}
	}
	int max=0;
	int maxval=0;
    for(Map.Entry<Integer,Integer> entry: map.entrySet()){
        if(entry.getValue()>max){
            max=entry.getValue();
            maxval=entry.getKey();
        }
        else if(entry.getValue()==max){
            if(entry.getKey()<maxval){
                maxval=entry.getKey();
            }
        }
    }
    return maxval;
    }
}