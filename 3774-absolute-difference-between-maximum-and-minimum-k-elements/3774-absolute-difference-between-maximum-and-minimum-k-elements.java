class Solution {
    public int absDifference(int[] nums, int k) {
        int n = nums.length;

        Arrays.sort(nums);
        int max = 0;
        int min = 0;
        int k1 = k;
        int k2 = k;
        for (int i = 0; i < n; i++) {

            if (k1 > 0) {
                min += nums[i];
                k1--;
            }
        }

        for (int i = n - 1; i >= 0; i--) {

            if (k2 > 0) {
                max += nums[i];
                k2--;
            }
        }

        return Math.abs(min - max);
    }
}