class Solution {
    public int findNonMinOrMax(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);

        if(n<=2){
            return -1;
        }


        for(int i=1;i<n-1;i++){
            return nums[i];
        }
        return  -1;

    }
}