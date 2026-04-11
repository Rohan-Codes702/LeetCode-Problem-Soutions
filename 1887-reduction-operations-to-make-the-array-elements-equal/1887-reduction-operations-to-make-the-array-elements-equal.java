class Solution {
    public int reductionOperations(int[] nums) {
        int count=0;
        int operation=0;
        Arrays.sort(nums);
        for(int i=nums.length-1;i>0;i--){
            if(nums[i]!=nums[i-1]){
               operation += nums.length - i;
            }
        }
        return operation;
    }
}