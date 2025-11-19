class Solution {
    public int findFinalValue(int[] nums, int original) {
        int n=nums.length;
        int val=original;
        Arrays.sort(nums);
        HashSet<Integer>set=new HashSet<>();

        for(int i:nums){
            set.add(i);
        }

        for(int i=0;i<n;i++){
           if(nums[i]==val){
             val=val*2;
           }
        }
        return val;
    }
}