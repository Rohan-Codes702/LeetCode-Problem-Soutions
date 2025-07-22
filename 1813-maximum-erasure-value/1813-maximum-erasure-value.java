class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int n=nums.length;
        HashSet<Integer>set=new HashSet<>();

        int i=0;
        int j=0;
        int sum=0;
        int max=0;

        while(i<n){

            if(!set.contains(nums[i])){
                set.add(nums[i]);
                sum+=nums[i];
                max=Math.max(max,sum);
                i++;
            }
            else{
                set.remove(nums[j]);
                sum-=nums[j];
                j++;
            }
        }

    return max;
    }
}