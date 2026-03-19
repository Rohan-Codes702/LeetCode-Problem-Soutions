class Solution {
    public long countBadPairs(int[] nums) {
        int n=nums.length;

        HashMap<Integer,Integer>map=new HashMap<>();
        long goodpair=0;
        for(int i=0;i<n;i++){
            int val=nums[i]-i;

            if(map.containsKey(val)){
                goodpair+=map.get(val);
            }
            map.put(val,map.getOrDefault(val,0)+1);
        }
        long totalPairs=(long)n*(n-1)/2;
        return totalPairs-goodpair;
    }
}