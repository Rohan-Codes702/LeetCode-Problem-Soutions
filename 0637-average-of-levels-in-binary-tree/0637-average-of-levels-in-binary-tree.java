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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double>result=new ArrayList<>();
        
        if(root==null)
        {
            return result;
        }
        Queue<TreeNode>queue=new LinkedList<>();
        queue.offer(root);
        
        while(!queue.isEmpty())
        {
            int levelsize=queue.size();
            double averagelevel=0;
            
            
            for(int i=0;i<levelsize;i++)
            {
                TreeNode currentnode=queue.poll();
                averagelevel+=currentnode.val;
                
            
            if(currentnode.left!=null)
            {
                queue.offer(currentnode.left);
            }
            if(currentnode.right!=null)
            {
                queue.offer(currentnode.right);
            }
        }
            averagelevel=averagelevel/levelsize;
            result.add(averagelevel);
        
    }
        return result;
}
}