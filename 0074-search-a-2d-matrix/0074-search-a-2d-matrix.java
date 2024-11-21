class Solution {
    public boolean searchMatrix(int[][] matrix, int target)
    {
     
        
        for(int []nums:matrix)
        {
            int start=0;
            int end=nums.length-1;
        
        
        while(start<=end)
        {
           int mid=(start+end)/2;
            
            if(nums[mid]==target)
            {
                return true;
            }
            
            if(nums[mid]>target)
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        }
        
        
        return false;
    }
}