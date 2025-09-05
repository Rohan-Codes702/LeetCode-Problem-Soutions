class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;

        int max=0;
        if(n==1){
            return nums[n-1];
        }

        for(int i=0;i<n;i++){
            int product=1;
            for(int j=i;j<n;j++){
            product*=nums[j];

                max=Math.max(max,product);

            }
        }
        return max;
    }
}