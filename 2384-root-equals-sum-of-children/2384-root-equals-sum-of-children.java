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
    public boolean checkTree(TreeNode root) {
        if (root == null) {
            return true;
        }
        return helper(root)==0;
    }

    public int helper(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if(root.left!=null && root.right!=null){
            if(root.left.val+root.right.val==root.val){
                return 0;
            }
        }

        return -1;

    }
}