class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        
        int i=0;
        int j=nums.length-1;
        
         double min=nums[j];

        while(i<=j)
        {
            double sum=(nums[i]+nums[j])/2.0;
            
            if(min>sum)
            {
                min=sum;
            }
            i++;
           j--;

        }
        
        return min;
        
    }
}


