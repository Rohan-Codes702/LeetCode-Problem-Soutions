class Solution {
    public int countBeautifulPairs(int[] nums) {
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            int first=nums[i];

            while(first>=10){
                first=first/10;
            }

            for (int j = i + 1; j < n; j++) {
                int last=nums[j]%10;

                if (gcd(first,last)== 1) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int gcd(int n, int m) {
        int max = 0;
        for (int i = 1; i <=Math.min(n, m); i++) {

            if (n % i == 0 && m % i == 0) {
                max = Math.max(i, max);
            }
        }
        return max;
    }
}