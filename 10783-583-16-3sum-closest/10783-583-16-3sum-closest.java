class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n=nums.length;

        int i,j;
        Arrays.sort(nums);

      int clsum=nums[0]+nums[1]+nums[2];

        for(i=0;i<n-2;i++){
            int left=i+1;
            int right=n-1;

         while(left<right){
            int sum=nums[i]+nums[left]+nums[right];

            if(Math.abs(sum-target)<Math.abs(clsum-target)){
                clsum=sum;
            }

     if(sum<target){
        left++;
     }
    else if(sum>target){
        right--;
     }
     else{
        return sum;
     }
         }
        }
        return clsum;
    }
}