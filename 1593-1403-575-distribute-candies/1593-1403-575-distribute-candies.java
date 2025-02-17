class Solution {
    public int distributeCandies(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        int n=nums.length;

        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }

      return Math.min(n/2,set.size());

    
    }
}