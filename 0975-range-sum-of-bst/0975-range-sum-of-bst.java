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
    public int rangeSumBST(TreeNode root, int low, int high) {
        ArrayList<Integer>list=new ArrayList<>();
        if(root==null){
            return 0;
        }
        helper(root,list);
        int sum=0;
        for(int i=0;i<list.size();i++){
            if(list.get(i)>=low && list.get(i)<=high){
                sum+=list.get(i);
            }
        }
        return sum; 
    }
        public void helper(TreeNode root,ArrayList<Integer>list){
            if(root==null){
                return ;
            }
            helper(root.left,list);
            list.add(root.val);
            helper(root.right,list);

        
    }
}