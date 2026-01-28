class Solution {
    public List<Integer> findLonely(int[] nums) {
        List<Integer>list=new ArrayList<>();
        int n=nums.length;

        HashMap<Integer,Integer>map=new HashMap<>();

        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        for(int i=0;i<n;i++){
            if(map.get(nums[i])==1 && !map.containsKey(nums[i]-1) && !map.containsKey(nums[i]+1)){
                list.add(nums[i]);
            }
        }
        return list;
    }
}