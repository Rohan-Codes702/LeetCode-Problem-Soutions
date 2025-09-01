class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int min=Integer.MIN_VALUE;
        int curr=0;

        for(int i=0;i<n;i++){
            curr+=nums[i];

            if(curr>min){
                min=curr;
            }

            if(curr<0){
                curr=0;
            }
        }
        return min;
    }
}