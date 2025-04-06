class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        int n=nums.length;
        int result[]=new int[n];

        HashSet<Integer>set=new HashSet<>();

        for(int i=0;i<n;i++){
            set.add(nums[i]);
            result[i]=set.size();
        }
        set.clear();

        for(int i=n-1;i>=0;i--){
            result[i]=result[i]-set.size();
            set.add(nums[i]);
        }
        return result;
    }
}