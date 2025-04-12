class Solution {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        HashSet<Double>set=new HashSet<>();

        int i=0;
        int j=n-1;

        while(i<j){
            Double avg=(nums[i]+nums[j])/2.0;
            set.add(avg);
            i++;
            j--;
        }

        return set.size();




        
    }
}