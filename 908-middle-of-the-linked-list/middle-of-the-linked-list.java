/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
 import java.util.*;
class Solution {
    public int countNodes(ListNode head){
        int count=0;
        ListNode temp=head;
        while(temp!=null){
            count=count+1;
            temp=temp.next;
        }
        return count;
    }


    public ListNode middleNode(ListNode head) {
        int count=countNodes(head);
      int mid = count / 2;
        ListNode temp = head;
        for (int i = 0; i < mid; i++) {
            temp = temp.next;
        }
        return temp;
    }
}