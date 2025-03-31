class Solution {
    public int maximumGap(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);

        if(n<2){
            return 0;
        }

       int diff=0;

       for(int i=0;i<n-1;i++){
       diff= Math.max(diff,nums[i+1]-nums[i]);
       }

        return diff;
    }
}