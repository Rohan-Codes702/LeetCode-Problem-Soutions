class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int[] result = new int[nums.length];
        int n = nums.length;

        int leftsum = 0;
        int totalsum = 0;

        for (int i : nums) {
            totalsum += i;
        }

        for (int i = 0; i < n; i++) {
            int rightsum = totalsum - leftsum - nums[i];

            result[i] = (nums[i] * i - leftsum) + (rightsum - nums[i] * (n - i - 1));

            leftsum += nums[i];
        }
        return result;
    }
}