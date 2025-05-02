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
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode pre=null;
        ListNode curr=slow;

        while(curr!=null)
        {
            ListNode temp=curr.next;
            curr.next=pre;
            pre=curr;
            curr=temp;
        }        
        while(pre!=null)
        {
            if(head.val!=pre.val)
            return false;
            head=head.next;
            pre=pre.next;
            
        }
        return true;
        
    }
}