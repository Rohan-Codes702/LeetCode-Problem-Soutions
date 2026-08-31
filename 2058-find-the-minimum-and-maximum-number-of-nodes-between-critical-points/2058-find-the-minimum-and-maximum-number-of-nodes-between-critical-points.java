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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] ans = { -1, -1 };
        ArrayList<Integer> list = new ArrayList<>();

        if(head==null || head.next==null || head.next.next==null){
            return ans;
        }

        ListNode temp = head;
        ListNode temp1 = head.next;
        ListNode temp2 = head.next.next;
        int i = 0;

        
        while (temp2 != null) {
            if (temp.val < temp1.val && temp1.val > temp2.val) {
                list.add(i);
            }
            if (temp.val > temp1.val && temp1.val < temp2.val) {
                list.add(i);
            }
            i++;
            temp2 = temp2.next;
            temp1 = temp1.next;
            temp = temp.next;
        }

        if(list.size()<2){
            return ans;
        }
        int max=list.get(list.size()-1)-list.get(0);
        int min=Integer.MAX_VALUE;
        for(int j=1;j<list.size();j++ ){
            min=Math.min(min,list.get(j)-list.get(j-1));
        }
        ans[0]=min;
        ans[1]=max;

        return ans;

    }
}