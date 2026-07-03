class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;

        int maxprofit=0;
        int min=prices[0];
        for(int i=1;i<n;i++){
            min=Math.min(min,prices[i]);
            maxprofit=Math.max(maxprofit,prices[i]-min);
           
        }
        return maxprofit;
    }
}