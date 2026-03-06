class Solution {
    public int findMaxK(int[] nums) {
        int n=nums.length;

        HashSet<Integer>set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }

        int max=-1;

        for(int i=0;i<n;i++){
            if(nums[i]>=0){
                if(set.contains(-nums[i])){
                    max=Math.max(nums[i],max);
                }
            }
            
        }
        return max;
    }
}