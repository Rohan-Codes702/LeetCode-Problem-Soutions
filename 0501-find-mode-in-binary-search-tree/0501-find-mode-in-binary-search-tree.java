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
    public int[] findMode(TreeNode root) {
       
        if (root == null) {
            return new int[0];
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        helper(root, map);

        ArrayList<Integer>list=new ArrayList<>();

        int maxfreq=0;
        for(int val:map.values()){
            maxfreq=Math.max(maxfreq,val);
        }

        for(int i:map.keySet()){
           if(map.get(i)==maxfreq){
            list.add(i);
           }
            
        }
       

        int []ans=new int[list.size()];

        for(int i=0;i<list.size();i++){
            ans[i]=list.get(i);
        }
        return ans;
    }

    public void helper(TreeNode root, HashMap<Integer, Integer> map) {
        if (root == null) {
            return;
        }

        helper(root.left, map);
        helper(root.right, map);
        map.put(root.val, map.getOrDefault(root.val, 0) + 1);

    }
}