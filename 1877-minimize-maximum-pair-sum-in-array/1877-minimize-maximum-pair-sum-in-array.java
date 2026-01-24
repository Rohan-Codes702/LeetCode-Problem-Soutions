class Solution {
    public int minPairSum(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);

        int i=0;
        int j=n-1;
         int max=0;
        while(i<=j){
            max=Math.max(max,nums[i]+nums[j]);
            i++;
            j--;
        }
        return max;
    }
}