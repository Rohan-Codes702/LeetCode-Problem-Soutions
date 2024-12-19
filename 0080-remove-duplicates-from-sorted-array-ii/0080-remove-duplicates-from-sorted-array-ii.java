class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int i;
        
        int j=2;
        
        for(i=2;i<n;i++)
        {
            if(nums[j-2]!=nums[i])
            {
                nums[j]=nums[i];
                j++;
                
            }
        }
        return j;
        
    }
}