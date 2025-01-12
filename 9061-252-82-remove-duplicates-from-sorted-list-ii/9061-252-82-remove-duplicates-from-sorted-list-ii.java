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
    public ListNode deleteDuplicates(ListNode head) {
        
     
       HashMap<Integer,Integer> map=new HashMap<>();
       TreeSet<Integer> sort=new TreeSet<>();
       
       ListNode temp=head;
       while(temp!=null){
            map.put(temp.val,map.getOrDefault(temp.val,0)+1);
            temp=temp.next;
       }
       temp=head;
       while(temp!=null){
            if(map.get(temp.val)==1){
                sort.add(temp.val);
            }
            temp=temp.next;
       }

       head=null;
       temp=null;
       for(Integer e:sort){
            if(head==null){
                head=new ListNode(e);
                temp=head;
            }
            else{
                temp.next=new ListNode(e);
                temp=temp.next;
            }
           
       }
       
       return head;

    }
}