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
    public ListNode swapNodes(ListNode head, int k) {
        
        int n=0;
         ListNode temp=head;
        
        while(temp!=null)
        {
            n++;
            temp=temp.next;
        }
        
        int i=0;
        ListNode temp1=head;
        
        while(i<k-1)
        {
            i++;
            temp1=temp1.next;
        }
        
        ListNode temp2=head;
         i=0;
         while(i<n-k)
         {
             i++;
             temp2=temp2.next;
         }
         int p=temp1.val;
        temp1.val=temp2.val;
        temp2.val=p;
        
        
        return head;
        
        
    }
}