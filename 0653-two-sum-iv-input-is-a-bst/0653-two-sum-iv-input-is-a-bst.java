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
    public boolean findTarget(TreeNode root, int k) {
        List<Integer>list=new ArrayList<>();
        fun(root,list);
        for(int i=0;i<list.size();i++){
            for(int j=0;j<list.size();j++){
                if((list.get(i)+list.get(j)==k) && i!=j){
                    return true;
                }
            }
        }
        return false;
    }
    public void fun(TreeNode root,List<Integer>list){
        if(root==null){
            return;
        }
        fun(root.left,list);
        list.add(root.val);
        fun(root.right,list);
    }
}