class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int n=nums.length;

        int max=0;

        for(int i=0;i<n-1;i++){

            int diff=Math.abs(nums[i]-nums[i+1]);
            max=Math.max(diff,max);
        }
                    int fdiff=Math.abs(nums[0]-nums[n-1]);

        max=Math.max(max,fdiff);

        return max;
    }
}