class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        int result=((purchaseAmount+5)/10)*10;

        int f=100-result;

        return f;
    }
}