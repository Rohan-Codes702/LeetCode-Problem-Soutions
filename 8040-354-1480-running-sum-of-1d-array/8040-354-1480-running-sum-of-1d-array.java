class Solution {
    public int[] runningSum(int[] nums) {
        int n=nums.length;
        int i;
        int sum=0;
        int []result=new int[n];
        
        for(i=0;i<n;i++)
        {
            sum=sum+nums[i];
            result[i]=sum;
            
        }
        return result;
    }
}