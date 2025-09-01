class Solution {
    public int[] rearrangeArray(int[] nums) {
        int ind=0;
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                arr[ind++]=nums[i];
                ind++;
            }
        }
        ind=1;
         for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                arr[ind++]=nums[i];
                ind++;
            }
        }
        return arr;
    }
}