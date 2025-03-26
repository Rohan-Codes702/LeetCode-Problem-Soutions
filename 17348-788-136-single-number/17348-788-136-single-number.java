class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();

      if(nums.length==1){
        return nums[0];
      }
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else
            {
                map.put(nums[i],1);
            }
        }

        for(int i=0;i<nums.length;i++){
            if(1==map.get(nums[i])){
                return nums[i];
            }

        }
        return -1;
    }
}