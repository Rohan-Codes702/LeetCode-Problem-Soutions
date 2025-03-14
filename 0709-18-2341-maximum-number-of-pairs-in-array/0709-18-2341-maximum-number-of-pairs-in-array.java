class Solution {
    public int[] numberOfPairs(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        int n=nums.length;
        int paircount=0;

        for(int i=0;i<n;i++){

            if(set.contains(nums[i])){
                set.remove(nums[i]);
                paircount++;
        

            }
            else{
                set.add(nums[i]);
            }
        }

        int result[]={paircount,set.size()};

        return result;
    }
}