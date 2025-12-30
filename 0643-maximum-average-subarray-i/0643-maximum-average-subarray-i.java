class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int l = 0;
        int r = k - 1;
        double sum = 0;

        for (int i = l; i <= r; i++) {
            sum += nums[i];
        }
        double max=sum/k;

        while (r < n - 1) {
            sum = sum - nums[l];
            l++;
            r++;
            sum += nums[r];
            max = Math.max(max, sum / k);
        }
        return max;
    }
}