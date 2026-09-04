class Solution {
    public boolean validMountainArray(int[] arr) {
    int max=Integer.MIN_VALUE;
	int index=Integer.MIN_VALUE;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>max) {
			max=arr[i];
			index=i;
		}
	}
	if(index==0||index==arr.length-1) {
		System.out.println(false);
	}
	boolean mountainup=false;
	for(int i=0;i<index;i++) {
		if(arr[i]<arr[i+1]) {
			mountainup=true;
		}
		else {
			//System.out.println("not mountain");
			mountainup=false;
			break;
		}
	}
	boolean mountaindown=false;
	for(int i=index;i<arr.length-1;i++) {
		if(arr[i]>arr[i+1]) {
		    mountaindown=true;
		}
	
	else {
		//System.out.println("not mountain");
		mountaindown=false;
		break;
	}
}
	
	if(mountainup==true&&mountaindown==true) {
		//System.out.println("true");
        return true;
	}
	else {
		//System.out.println("false");
        return false;
	}
    }
}