class Solution {
    public int[] getSneakyNumbers(int[] nums) {
      HashMap<Integer,Integer>map=new HashMap<>();

      for(int i=0;i<nums.length;i++){
        if(map.containsKey(nums[i])){
            map.put(nums[i],map.get(nums[i])+1);
        }
        else{
            map.put(nums[i],1);
        }
      }
     
     ArrayList<Integer>list=new ArrayList<>();

      for(int key:map.keySet()){

        if(map.get(key)>1){
            list.add(key);

        }
      }

      int []arr=new int[list.size()];

      for(int i=0;i<list.size();i++){
        arr[i]=list.get(i);
      }

      return arr;
    }
}