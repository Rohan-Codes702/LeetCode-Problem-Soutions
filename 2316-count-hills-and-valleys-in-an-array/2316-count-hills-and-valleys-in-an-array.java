class Solution {
    public int countHillValley(int[] nums) {
        int n=nums.length;

        int j=0;
        int count=0;
        for(int i=1;i<n-1;i++){

            if((nums[j]<nums[i] && nums[i]>nums[i+1]) || (nums[j]>nums[i] && nums[i+1]>nums[i]))
            {
                count++;
                j=i;
            }
        }
        return count;
    }
}