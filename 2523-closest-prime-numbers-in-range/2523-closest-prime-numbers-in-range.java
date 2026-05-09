class Solution {

    public int[] closestPrimes(int left, int right) {

        int[] arr = { -1, -1 };

        int firstprime = -1;
        int min = Integer.MAX_VALUE;

        for (int i = left; i <= right; i++) {

            if (isprime(i)) {

                if (firstprime == -1) {

                    firstprime = i;
                }
                else {

                    int diff = i - firstprime;

                    if (diff < min) {

                        min = diff;

                        arr[0] = firstprime;
                        arr[1] = i;
                    }

                    firstprime = i;
                }
            }
        }

        return arr;
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