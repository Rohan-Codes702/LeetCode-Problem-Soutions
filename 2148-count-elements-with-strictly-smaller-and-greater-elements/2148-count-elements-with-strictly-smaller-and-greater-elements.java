class Solution {
    public int countElements(int[] nums) {
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            boolean issml=false;
            boolean isbr=false;
            for(int j=0;j<n;j++){
                if(nums[j]>nums[i]){
                    isbr=true;
                }
                if(nums[j]<nums[i]){
                    issml=true;
                }
            }
            if(isbr && issml){
                count++;
            }
        }
        return count;
    }
}