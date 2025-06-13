class Solution {
    public int[] shuffle(int[] nums, int n) {
        int m=nums.length;
        int res[]=new int[m];
        int j=0;
        for(int i=0;i<n;i++){
            res[j++]=nums[i];
            res[j++]=nums[n+i];

        }
        return res;
    }
}