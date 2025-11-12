class Solution {
    public boolean isThree(int n) {
        if (n == 1 || n == 2) {
            return false;
        }
        int count = 0;
        for (int i = 1; i <= 100000; i++) {

            if (n % i == 0) {
                count++;
            }
        }
        return count == 3;
    }
}