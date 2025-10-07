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
    public boolean isUnivalTree(TreeNode root) {
        if(root==null){
            return true;
        }
        ArrayList<Integer>list=new ArrayList<>();

        helper(root,list);

        HashSet<Integer>set=new HashSet<>();

        for(int i=0;i<list.size();i++){
            set.add(list.get(i));
        }

        if(set.size()==1){
            return true;
        }
        return false;

    
    }
    public void helper(TreeNode root,ArrayList<Integer>list){
        if(root==null){
            return ;
        }
        helper(root.left,list);
        helper(root.right,list);

        list.add(root.val);

        
    }
}