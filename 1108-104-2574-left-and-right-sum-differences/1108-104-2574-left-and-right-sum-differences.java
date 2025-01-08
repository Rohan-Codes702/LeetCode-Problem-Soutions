class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int left[]=new int[n];
        int right[]=new int[n];
        
        int leftsum=0;
        
        for(int i=0;i<n;i++){
            left[i]=leftsum;
            leftsum+=nums[i];
        }
        
           int rightsum=0;
            for(int i=n-1;i>=0;i--){
            right[i]=rightsum;
            rightsum+=nums[i];
        }
        
        for(int i=0;i<n;i++){
            left[i]=Math.abs(left[i]-right[i]);
        }
        return left;
        
    }
}

