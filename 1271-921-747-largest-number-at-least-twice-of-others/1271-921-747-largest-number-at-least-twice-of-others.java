import java.util.Arrays;

class Solution {
    public int dominantIndex(int[] nums) {
        int n = nums.length;
        int[] sortarray = nums.clone();
        Arrays.sort(sortarray);

        int larget = sortarray[n - 1];  
        int second = (n > 1) ? sortarray[n - 2] : 0; 

        if (larget >= 2 * second) {  
            for (int i = 0; i < n; i++) {
                if (nums[i] == larget) {
                    return i;
                }
            }
        }
        return -1;
    }
}
