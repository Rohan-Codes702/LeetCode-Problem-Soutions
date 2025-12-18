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
    public ListNode mergeNodes(ListNode head) {
        
        ListNode fast =head.next;
        ListNode newList=new ListNode();
        ListNode curr=newList;
        int sum=0;

        while(fast!=null){
            if(fast.val!=0){
                sum+=fast.val;
            }
            if(fast.val==0){
                curr.next=new ListNode(sum);
                curr=curr.next;
                sum=0;
                
            }
            
            fast=fast.next;
        }
        return newList.next;
    }
}