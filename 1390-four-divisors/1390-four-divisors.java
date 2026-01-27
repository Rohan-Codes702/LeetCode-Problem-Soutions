class Solution {
    public int sumFourDivisors(int[] nums) {
        int ans = 0;
        int n = nums.length;

        for (int x : nums) {
            int count = 0;
            int sum = 0;
            for (int i = 1; i * i <= x; i++) {
                if (x % i == 0) {
                    int d1 = i;
                    int d2 = x / i;

                    if (d1 == d2) {
                        count += 1;
                        sum += d1;
                    } else {
                        count += 2;
                        sum += d1 + d2;
                    }
                }
            }
            if (count == 4) {
                ans += sum;
            }
        }

        return ans;
    }
}