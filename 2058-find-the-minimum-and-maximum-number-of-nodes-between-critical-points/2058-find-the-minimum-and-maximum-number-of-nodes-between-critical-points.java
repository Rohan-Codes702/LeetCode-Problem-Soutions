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
        int res[] = { -1, -1 };
        ArrayList<Integer> list = new ArrayList<>();

        ListNode prev = head;
        ListNode temp = head.next;
        ListNode nxt = head.next.next;
        int index = 1;
        while (nxt != null) {
            if (prev.val < temp.val && nxt.val < temp.val) {
                list.add(index);

            }
            if (prev.val > temp.val && nxt.val > temp.val) {
                list.add(index);
            }
            index++;
            nxt = nxt.next;
            temp = temp.next;
            prev = prev.next;
        }
        if (list.size() < 2)
            return res;

        Collections.sort(list);

        int min = Integer.MAX_VALUE;
    
        for (int i = 1; i < list.size(); i++) {
            min=Math.min(list.get(i)-list.get(i-1),min);
        }
        int max=list.get(list.size()-1)-list.get(0);
        res[0] = min;
        res[1] = max;

        return res;

    }
}