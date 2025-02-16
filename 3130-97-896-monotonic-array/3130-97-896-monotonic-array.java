class Solution {
    public boolean isMonotonic(int[] nums) {
        int n=nums.length;

       boolean incresing=true;
       boolean decresing=true;

        for(int i=0;i<n-1;i++){
            if(nums[i]<nums[i+1]){
                decresing=false;

            }
            else if(nums[i]>nums[i+1])
            {
                    incresing=false;
            }
            
        }
       return incresing || decresing;
    }
}