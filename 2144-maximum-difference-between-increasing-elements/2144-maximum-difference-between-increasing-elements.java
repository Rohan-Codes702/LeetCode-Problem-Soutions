class Solution {
    public int maximumDifference(int[] nums) {
        int n=nums.length;
        int max=-1;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if( nums[i]<nums[j]){
                    int sub=nums[j]-nums[i];
                    max=Math.max(sub,max);
                }
            }
        }
        return max;
    }
}