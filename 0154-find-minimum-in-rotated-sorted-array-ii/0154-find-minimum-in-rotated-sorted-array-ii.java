class Solution {
    public int findMin(int[] nums)
    {
      int start=0;
      int end=nums.length-1;
      int min =6000;
        
        while(start<=end)
        {
            int mid=(start+end)/2;
            
            if(nums[start]==nums[mid] && nums[mid]==nums[end])
            {
                min=Math.min(min,nums[start]);
                start++;
                end--;
            }
            
            else if(nums[start]<=nums[mid])
                
                {
                   min= Math.min(min,nums[start]);
                    start=mid+1;
                }
                
            
            else
            {
                min=Math.min(min,nums[mid]);
                end=mid-1;
            }
        }
        return min;
    }
}