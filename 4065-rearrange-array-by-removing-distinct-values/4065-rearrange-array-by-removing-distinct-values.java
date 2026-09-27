class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;

        int ans[]=new int[n];

        Map<Integer,Integer>map=new TreeMap<>();

        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        int p=0;

        while(p<n){
            for(int  key:map.keySet()){
                if(p==n){
                    break;
                }
                if(map.get(key)>0 ){
                    ans[p++]=key;
                    map.put(key,map.get(key)-1);
                }
            }
        }
        return ans;
    }
}