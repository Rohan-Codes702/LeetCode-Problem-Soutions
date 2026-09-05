class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int []min=new int[n];
         min[n-1]=nums[n-1];

        for(int i=n-2;i>=0;i--){
            min[i]=Math.min(nums[i],min[i+1]);
        }
        int max=Integer.MIN_VALUE;
        for(int j=0;j<n;j++){
            max=Math.max(nums[j],max);

            int result=max-min[j];

            if(result<=k){
                return j;
            }
        }
        return -1;
    }
}