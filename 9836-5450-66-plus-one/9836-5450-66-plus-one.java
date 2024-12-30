class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        
        // Start from the last digit and move towards the first
        for (int i = n - 1; i >= 0; i--) {
            digits[i]++;
            
            // If there's no carry, return the updated array
            if (digits[i] < 10) {
                return digits;
            }
            
            // If there's a carry, set the current digit to 0
            digits[i] = 0;
        }
        
        // If all digits were 9, create a new array (e.g., 999 -> 1000)
        int[] result = new int[n + 1];
        result[0] = 1; // First digit is 1, rest are 0 by default
        return result;
    }
}
