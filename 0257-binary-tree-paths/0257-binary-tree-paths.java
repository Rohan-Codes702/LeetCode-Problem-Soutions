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
    public static void traverse(TreeNode root,List<String>a,String s)
    {
        if(root==null)
        {
            return;
        }
        if(root.left==null && root.right==null)
        {
            a.add(s+root.val);
            
        }
        traverse(root.left,a,s+root.val+"->");
        traverse(root.right,a,s+root.val+"->");
    }
    public List<String> binaryTreePaths(TreeNode root)
    {
        List<String>a=new ArrayList<>();
        traverse(root,a,"");
        return a;
    }
}