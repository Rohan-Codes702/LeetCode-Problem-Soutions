class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        int half = n / 2;
        long[] arr1 = new long[n / 2];
        long[] arr2 = new long[n - half];
        long[] sq = new long[n];

        long ans = 0;

        for (int i = 0; i < n; i++) {
            sq[i] = nums[i] * nums[i];
        }
        Arrays.sort(sq);
        for (int i = 0; i < half; i++) {
            arr1[i] = sq[i];
        }
        int idxj = 0;
        for (int j = half; j < n; j++) {
            arr2[idxj++] = sq[j];
        }
        int idx1 = 0;
        int idx2 = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                ans += arr2[idx1++];
            } else {
                ans -= arr1[idx2++];
            }
        }
        return ans;
    }
}