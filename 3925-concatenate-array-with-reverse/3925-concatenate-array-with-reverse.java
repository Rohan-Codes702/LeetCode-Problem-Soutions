class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n=nums.length;
        int[]result=new int [n * 2];
        int j=0;
        for(int i=0;i<n;i++){
            result[j++]=nums[i];
        }

        for(int i=n-1;i>=0;i--){
            result[j++]=nums[i];
        }
        return result;
    }
}