class Solution {
    public int[] sortArrayByParity(int[] nums) {
        
        for(int i=0;i<nums.length;i++){
            int even=nums[i];
            if(nums[i]%2==0){
                for(int j=i;j>0;j--){
                    nums[j]=nums[j-1];
                }
                nums[0]=even;
            }
        }
        return nums;
    }
}