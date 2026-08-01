/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
 import java.util.*;
public class Solution {
    public boolean hasCycle(ListNode head) {
        HashSet <ListNode> set=new HashSet<>();
        ListNode temp=head;
        while(temp!=null&&temp.next!=null){
             if(set.contains(temp.next)){
               // break;
                return true;
             }
             else if(temp.next!=null){
                set.add(temp.next);
             }
             else if (temp.next==null){
                //break;
                return false;
             }
             temp=temp.next;
        }
     return false;
    }
}