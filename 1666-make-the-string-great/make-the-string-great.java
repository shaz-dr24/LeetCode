class Solution {
    public String makeGood(String s) {
    String [] arr=s.split("");
	Stack<String> st=new Stack<>();
	for(int i=0;i<arr.length;i++) {
		if(!st.isEmpty()&&st.peek().equalsIgnoreCase(arr[i]) &&!st.peek().equals(arr[i])) {
			st.pop();
		}
		else {
			st.push(arr[i]);
		}
	}

    StringBuffer sb=new StringBuffer("");
    while(!st.isEmpty()){
        sb.append(st.pop());
    }
    return sb.reverse().toString();
    }
}