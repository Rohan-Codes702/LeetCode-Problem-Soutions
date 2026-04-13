class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int n=nums.length;
        int i=0;
        int j=n-1;
        int min=Integer.MAX_VALUE;
       while(i<=j){
        if(nums[i]==target){
            min= Math.min(min,Math.abs(start-i));
        }
         if(nums[j]==target){
            min= Math.min(min,Math.abs(start-j));
        }
        i++;
        j--;
        
       }
       return min;
    }
}