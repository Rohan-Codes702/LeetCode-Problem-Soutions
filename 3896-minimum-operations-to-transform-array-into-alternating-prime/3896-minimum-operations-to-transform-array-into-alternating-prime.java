class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;

        int op = 0;

        for (int i = 0; i < n; i += 2) {
            int number = nums[i];
            while (! isprime(number)) {
                number = number + 1;
                op++;
            }
        }

        for (int i = 1; i < n; i += 2) {
            int number = nums[i];
            
            while (isprime(number)) {
                number = number + 1;
                op++;
            }
        }

        return op;

    }

    public static boolean isprime(int n) {

        if (n <= 1) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }

        }
        return true;
    }
}