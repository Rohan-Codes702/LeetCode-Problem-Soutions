/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxLevelSum(TreeNode root) {
        List<List<Integer>> list1 = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        List<Integer> list2 = new ArrayList<>();

        while (!q.isEmpty()) {
            TreeNode curr = q.remove();

            if (curr == null) {
                list1.add(list2);

                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                    list2 = new ArrayList<>();
                }
            } else {
                list2.add(curr.val);
                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
            }

        }

        int max = Integer.MIN_VALUE;
        int k = 1;
        int ans=k;
        for (int i = 0; i < list1.size(); i++) {
            int sum = 0;
            for (int j = 0; j < list1.get(i).size(); j++) {
                sum += list1.get(i).get(j);
            }
            if(sum>max){
                max=sum;
                ans=k;
            }
            k++;
        }
        return ans;
    }
}