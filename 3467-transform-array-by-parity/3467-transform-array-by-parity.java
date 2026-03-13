class Solution {
    public int[] transformArray(int[] nums) {
        int n=nums.length;
        int res[]=new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                nums[i]=0;
            }
            else{
                nums[i]=1;
            }
        }
         Arrays.sort(nums);

         for(int i=0;i<n;i++){
            res[i]=nums[i];
         }
         return res;

    }
}