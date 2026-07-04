class Solution {
    public int findMin(int[] nums) {
        
        int min=Integer.MAX_VALUE;

        int i=0;
        int j=nums.length-1;

        while(i<=j){
            min=Math.min(min,nums[i]);
             min=Math.min(min,nums[j]);
             i++;
             j--;

        }
        return min;
    }
}