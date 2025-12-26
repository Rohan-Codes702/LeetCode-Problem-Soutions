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
    public void flatten(TreeNode root) {
        ArrayList<TreeNode>list=new ArrayList<>();
        helper(root,list);

        for(int i=0;i<list.size()-1;i++){
            list.get(i).left=null;
            list.get(i).right=list.get(i+1);
        }

    }
    public void helper(TreeNode root, ArrayList<TreeNode>list){
        if(root==null){
            return ;
        }
        list.add(root);
        helper(root.left,list);
        helper(root.right,list);
    }
}