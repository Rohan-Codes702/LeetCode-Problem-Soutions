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
    public TreeNode search(TreeNode root,int val)
    {
        if(root==null)
        {
            return root;
        }
        
        if(root.val==val)
        {
            return root;
        }
        
        else if(root.val<val)
        {
            return search(root.right,val);
            
        }
         
        else if(root.val>val)
        {
            return search(root.left,val);
        }
        return null;
    }
    public TreeNode searchBST(TreeNode root, int val) 
    {
        while(root!=null)
        {
        if(root.val==val)
        {
            return root;
        }
         else if(root.val>val)
         {
             root=root.left;
         }
            
            else if(root.val<val)
            {
                root=root.right;
            }
        }
        return root;
        
    }
}