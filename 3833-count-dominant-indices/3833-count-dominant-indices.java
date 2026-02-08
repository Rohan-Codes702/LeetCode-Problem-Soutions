class Solution {
    public int dominantIndices(int[] nums) {
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            int avg=0;
            int av=0;
            for(int j=i+1;j<n;j++){
                avg+=nums[j];
                av++;
            }
            if(av!=0){
            int divide=avg/av;
            if(nums[i]>divide){
                count++;
            }
            }

        }
        return count;
    }
}