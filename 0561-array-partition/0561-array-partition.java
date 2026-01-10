class Solution {
    public int arrayPairSum(int[] nums) {
        int n=nums.length;
        int sum1=0;
      
        Arrays.sort(nums);
        for(int i=0;i<n;i+=2){
            sum1+=nums[i];
        }

        return sum1;
    }
}