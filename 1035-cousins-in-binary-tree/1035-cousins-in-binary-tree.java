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
    int count1 = -1;
    int count2 = -1;
    TreeNode parent1 = null;
    TreeNode parent2 = null;

    public boolean isCousins(TreeNode root, int x, int y) {
        if (root == null) {
            return false;
        }
        helper1(root, x, 0,null);
        helper2(root, y, 0,null);

        return count1 == count2 && parent1 != parent2;

    }

    public void helper1(TreeNode root, int x, int depth,TreeNode parent) {
        if (root == null) {
            return;
        }

        if (root.val == x) {
            count1 = depth;
            parent1=parent;
            return;
        }
        helper1(root.left, x, depth + 1,root);
        helper1(root.right, x, depth + 1,root);

    }

    public void helper2(TreeNode root, int y, int depth,TreeNode parent) {
        if (root == null) {
            return;
        }

        if (root.val == y) {
            count2 = depth;
             parent2=parent;
            return;
        }
        helper2(root.left, y, depth + 1,root);
        helper2(root.right, y, depth + 1,root);

    }
}