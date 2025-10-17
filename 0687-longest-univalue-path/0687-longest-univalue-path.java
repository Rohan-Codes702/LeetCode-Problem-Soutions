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
    int max = 0;

    public int longestUnivaluePath(TreeNode root) {
        if (root == null) {
            return 0;
        }
        helper(root);
        return max;

    }

    public int helper(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = helper(root.left);
        int right = helper(root.right);

        int leftval = 0;
        int rightval = 0;

        if (root.left != null && root.left.val == root.val) {
            leftval = left + 1;
        }
        if (root.right != null && root.right.val == root.val) {
            rightval = right + 1;
        }

        max = Math.max(max, leftval + rightval);
        return Math.max(leftval, rightval);
    }
}