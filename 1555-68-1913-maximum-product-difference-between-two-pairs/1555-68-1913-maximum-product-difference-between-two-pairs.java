class Solution {
    public int maxProductDifference(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);

        int max=nums[n-1]* nums[n-2];
        int min=nums[0]*nums[1];

        int result=max-min;

        return result;
       
    }
}