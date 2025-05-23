class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        int n=nums.length;

        HashMap<Integer,Integer>map=new HashMap<>();

        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);

            }
            else{
                map.put(nums[i],1);
            }
        }

        for(int key:map.keySet()){
            if(map.get(key)>2){
                return false;
            }
        }
        return true;
    }
}