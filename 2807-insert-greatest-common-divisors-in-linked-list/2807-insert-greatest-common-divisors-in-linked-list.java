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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode slow=head;
        ListNode fast=head.next;

        while(fast!=null ){
            int a=slow.val;
            int b=fast.val;

            int mx=0;
            for(int i=1;i<=Math.min(a,b);i++){
                if(a%i==0 && b%i==0){
                    mx=Math.max(i,mx);
                }
            }
             ListNode node=new ListNode(mx);
            node.next=fast;
             slow.next=node;
             slow=fast;
             fast=fast.next;
            

        }
        return head;
    }
}