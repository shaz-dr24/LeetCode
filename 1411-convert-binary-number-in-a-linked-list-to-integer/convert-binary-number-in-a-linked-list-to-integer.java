/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) {
       this.val = val; 
       }
 *     ListNode(int val, ListNode next) { 
        this.val = val; this.next = next; 
        }
 * }
 */
 import java.util.*;

class Solution {
    public int getDecimalValue(ListNode head) {
         ArrayList<Integer> al=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            al.add(temp.val);
            temp=temp.next;
        }
        int[]arr=new int[al.size()];
        for(int i=0;i<al.size();i++){
            arr[i]=al.get(i);
        }
        StringBuffer sb=new StringBuffer("");
        for(int i=0;i<arr.length;i++){
            sb.append(arr[i]);
        }
        String binval=sb.toString();
        int ans=Integer.parseInt(binval,2);
        return ans;
    }
}