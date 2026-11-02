class Solution {
    public int minMoves2(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int median = -1;
        if (n % 2 != 0) {
            median = nums[n/2];
        } else {
            int nm=n/2;
            median = (nums[nm] + nums[nm-1])/2;
        }

        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += Math.abs(median - nums[i]);
        }

        return sum;
    }
}