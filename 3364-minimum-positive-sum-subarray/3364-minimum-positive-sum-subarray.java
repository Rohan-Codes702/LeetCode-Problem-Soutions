class Solution {
    public int minimumSumSubarray(List<Integer> list, int l, int r) {
        int n = list.size();
        int min = Integer.MAX_VALUE;

        for (int k = l; k <= r; k++) {
            int sum = 0;
            int left = 0;
            int right = 0;

            while (right < n) {
                sum += list.get(right);

                if (right - left + 1 > k) {
                    sum -= list.get(left);
                    left++;
                }

                if (right - left + 1 == k && sum > 0) {
                    min = Math.min(min, sum);
                }
                right++;
            }

        }
         return min != Integer.MAX_VALUE ? min : -1;
    }
}