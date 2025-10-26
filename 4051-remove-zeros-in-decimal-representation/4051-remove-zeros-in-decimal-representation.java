class Solution {
    public long removeZeros(long n) {
        StringBuilder str = new StringBuilder();
        Boolean isNegative = false;
        if (n < 0) {
            isNegative = true;
            n = -n;
        }
        while (n != 0) {
            int rem = (int) Math.abs(n % 10);

            n = n / 10;
            if (rem != 0) {
                str.append(rem);
            }

        }
        if (str.length() == 0) {
            return 0;
        }
        str.reverse();
        long result = Long.parseLong(str.toString());

        if (isNegative) {
            result = -result;
        }
        return result;

    }
}