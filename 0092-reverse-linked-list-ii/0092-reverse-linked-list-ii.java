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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        
        if(head==null || left==right){
            return head;
        }

        
        ListNode nextNode=head;

        int i=1;

        ListNode d=new ListNode(0,head);
        ListNode prev=d;
        while(i<left && nextNode.next!=null){
            prev=prev.next;
            nextNode=nextNode.next;
            i++;
        }

        
        ListNode tempNext=nextNode;

        ListNode dummy=null;

        while(i<=right && nextNode!=null){
            
            ListNode node=nextNode.next;
            nextNode.next=dummy;
            dummy=nextNode;
            nextNode=node;
            i++;
        }

        if(nextNode==null){
            prev.next=dummy;
        }
        else{
        prev.next=dummy;
        tempNext.next=nextNode;
       
        }


        return d.next;

    }
}