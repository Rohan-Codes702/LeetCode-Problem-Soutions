class Solution {
    public int missingMultiple(int[] nums, int k) {
        int n=nums.length;

        HashSet<Integer>set=new HashSet<>();

        for(int i:nums){
            set.add(i);
        }

        int i=1;
       while(true){
            if(!set.contains(i*k)){
                return i*k;
            }
            i++;
        }
       
    }
}