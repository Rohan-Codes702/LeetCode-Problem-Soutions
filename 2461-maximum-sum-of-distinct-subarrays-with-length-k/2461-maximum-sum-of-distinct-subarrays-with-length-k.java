class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n = nums.length;
        int l = 0;
        long sum = 0, maxSum = 0;
        HashSet<Integer> set = new HashSet<>();

        for (int r = 0; r < n; r++) {
            // remove duplicates
            while (set.contains(nums[r])) {
                sum -= nums[l];
                set.remove(nums[l]);
                l++;
            }

            // add right
            sum += nums[r];
            set.add(nums[r]);

            // keep window size k
            if (r - l + 1 > k) {
                sum -= nums[l];
                set.remove(nums[l]);
                l++;
            }

            // check valid window
            if (r - l + 1 == k) {
                maxSum = Math.max(maxSum, sum);
            }
        }

        return maxSum;
    }
}
