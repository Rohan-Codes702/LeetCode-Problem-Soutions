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
    public boolean isBalanced(TreeNode root) {
        return helper(root)!=-1;
    }
    public int helper(TreeNode root){
        if(root==null){
            return 0;
        }

        int leftcount=helper(root.left);
        if(leftcount==-1){
            return -1;
        }
        int rightcount=helper(root.right);
        if(rightcount==-1){
            return -1;
        }
        
        int ht=Math.abs(leftcount-rightcount);
        if(ht>1){
            return -1;
        }
        return Math.max(leftcount,rightcount)+1;
    }
}