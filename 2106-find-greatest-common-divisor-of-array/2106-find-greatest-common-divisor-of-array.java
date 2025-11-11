class Solution {
    public int findGCD(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);

        int first=nums[0];
        int second=nums[n-1];

        for(int i=first;i>=1;i--){
            if(first%i==0 && second%i==0){
                return i;
            }
        }
        return -1;


    }
}