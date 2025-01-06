class Solution {
    public int findMiddleIndex(int[] nums) {
        
        int n=nums.length;
        int sum=0;
        
        for(int i=0;i<n;i++){
            sum=sum+nums[i];
        }
        
        int suffix=0;
        int prefix=0;
        
        for(int i=0;i<n;i++){
            suffix=sum-prefix;
            prefix+=nums[i];
                
                if(prefix==suffix)
                {
                    return i;
                }
        }
        return -1;
    }
}