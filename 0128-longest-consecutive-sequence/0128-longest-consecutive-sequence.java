class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;

        HashSet<Integer>set=new HashSet<>();

        for(int i:nums){
            set.add(i);
        }
        int max =0;

        for(int i:set){
            if (i == Integer.MIN_VALUE || !set.contains(i - 1)){
                int curr=i;
                int len=1;

                while(curr!=Integer.MAX_VALUE && set.contains(curr+1)){
                    curr++;
                    len++;
                }
                max=Math.max(max,len);
            }
        }
        return max;

    }
}