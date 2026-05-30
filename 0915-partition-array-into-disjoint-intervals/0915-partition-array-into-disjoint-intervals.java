class Solution {
    public int partitionDisjoint(int[] nums) {
        int n=nums.length;

        int leftmx=nums[0];
        int currmx=nums[0];
        int idx=0;

        for(int i=1;i<n;i++){
            currmx=Math.max(currmx,nums[i]);
            if(leftmx>nums[i]){
                idx=i;
                leftmx=currmx;
            }
        }
        return idx+1;
    }
}