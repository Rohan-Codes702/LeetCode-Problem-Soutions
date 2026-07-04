class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int maxspeed = 0;

        for (int i = 0; i < n; i++) {
            maxspeed = Math.max(piles[i], maxspeed);
        }

        int i = 0;
        int j = maxspeed;
        int ans = 0;
        int hrcount = 0;
        while (i <= j) {

            int k = (i + j) / 2;

            for (int p : piles) {
                hrcount += Math.ceil((double)p / k);
            }

            if (hrcount <= h) {
                ans = k;
                 j = k - 1;

            } else {
                i = k + 1;
            }
            hrcount = 0;

        }
        return ans;
    }
}