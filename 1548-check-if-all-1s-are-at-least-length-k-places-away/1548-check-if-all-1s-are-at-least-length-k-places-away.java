class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int n = nums.length;
        int cnt = k;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                if (cnt < k) {
                    return false;
                }
                cnt = 0;
            } else {
                cnt++;
            }
        }
        return true;
    }
}