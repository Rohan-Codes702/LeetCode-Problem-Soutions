class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for (int j = 0; j <= i; j++) {
                max = Math.max(nums[j], max);
            }
            for (int l = i; l < n; l++) {
                min = Math.min(nums[l], min);
            }
            int result = max - min;

            if (result <= k) {
                return i;
            }

        }
        return -1;
    }
}