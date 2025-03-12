class Solution {
    public int maximumCount(int[] nums) {
        int n=nums.length;

        int poscount=0;
        int negcount=0;

        for(int i=0;i<n;i++){
            if(nums[i]>0){
                poscount++;
            }
            if(nums[i]<0){
                negcount++;

            }

        }

    return Math.max(poscount,negcount);
        
    }
}