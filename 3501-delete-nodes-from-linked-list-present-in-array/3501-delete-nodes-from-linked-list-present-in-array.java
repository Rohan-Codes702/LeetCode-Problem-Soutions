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
    public ListNode modifiedList(int[] nums, ListNode head) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        while (head != null && map.containsKey(head.val)) {
            head = head.next;
        }
        ListNode temp = head;
        ListNode prev = null;
        while (temp != null) {
            if (map.containsKey(temp.val)) {
                prev.next = temp.next;
            } else {
                prev = temp;
            }
            temp = temp.next;
        }
        return head;
    }
}
