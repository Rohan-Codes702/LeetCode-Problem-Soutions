class Solution {
    public long[] findPrefixScore(int[] nums) {
        long[] result = new long[nums.length];
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
             if (i == 0) {
                result[i] = max + nums[i];
            } 
            else {
                result[i] = max + nums[i] + result[i - 1];
            }
        }
        return result;
    }
}