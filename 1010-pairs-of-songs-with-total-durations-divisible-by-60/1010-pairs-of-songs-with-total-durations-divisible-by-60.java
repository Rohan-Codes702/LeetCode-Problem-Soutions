class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int count=0;

        for(int i:time){
            int rem=i%60;

            int need=(60-rem)%60;

            count+=map.getOrDefault(need,0);

            map.put(rem,map.getOrDefault(rem,0)+1);

        }
        return  count;
    }
}