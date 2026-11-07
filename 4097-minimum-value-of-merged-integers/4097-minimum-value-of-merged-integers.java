class Solution {
    public int minMergedInteger(int[] nums) {
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i += 2) {
            StringBuilder str = new StringBuilder();
            str.append(nums[i]);
            str.append(nums[i + 1]);

            int nm = Integer.parseInt(str.toString());
            min = Math.min(min, nm);

        }
        return min;
    }
}