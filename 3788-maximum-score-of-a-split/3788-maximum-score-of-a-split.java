class Solution {
    public long maximumScore(int[] nums) {
        int n=nums.length;
        long ans=Integer.MIN_VALUE;
        long sum=0;
       
       int suffixmin[]=new int[n];
       suffixmin[n-1]=nums[n-1];

       for(int i=n-2;i>=0;i--){
        suffixmin[i]=Math.min(nums[i],suffixmin[i+1]);
       }

       for(int i=0;i<n-1;i++){
        sum+=nums[i];

        long res=sum-suffixmin[i+1];
        ans=Math.max(ans,res);
       }
    return ans;

    }
}