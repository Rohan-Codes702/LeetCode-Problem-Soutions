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
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy=new ListNode(0);

        ListNode temp=head;
        while(temp!=null){
        ListNode pre=dummy;
        ListNode curr=temp.next;

                while(pre.next!=null && pre.next.val < temp.val){
                        pre=pre.next;
                }
    
                    temp.next=pre.next;
                    pre.next=temp;
                    temp=curr;
                
                
        }
        return dummy.next;

    }   
}