class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int maxcount=0;
        int currcount=0;
        
        for(int i=0;i<n;i++)
        {
            if(nums[i]==1)
            {
                currcount++;
                maxcount=Math.max(maxcount,currcount);
                
            }
            else
            {
                currcount=0;

            }
            
        }
        return maxcount;

    }
}