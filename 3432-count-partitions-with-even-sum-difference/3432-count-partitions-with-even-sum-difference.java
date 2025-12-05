class Solution {
    public int countPartitions(int[] nums) {
        int n=nums.length;
      
      
        int count=0;
        for(int i=0;i<n-1;i++){
             int leftSum=0;
            for(int j=0;j<=i;j++){
                leftSum+=nums[j];
            }
                 int rightsum=0;
            for(int k=i+1;k<n;k++){
                rightsum+=nums[k];
            }

            int diff=leftSum-rightsum;

            if(diff%2==0){
                count++;
            }
        }

        return count;

        
    }
}