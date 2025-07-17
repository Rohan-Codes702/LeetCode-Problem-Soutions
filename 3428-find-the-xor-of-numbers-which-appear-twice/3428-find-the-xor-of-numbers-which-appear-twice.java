class Solution {
    public int duplicateNumbersXOR(int[] nums) {
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
        ArrayList<Integer>list=new ArrayList<>();
        for(int key:map.keySet()){
            if(map.get(key)==2){
                list.add(key);
            }
        }
            if(list.size()==1){
                return list.get(0);
            }
            int res=0;
        for(int i=0;i<list.size();i++){
             res= res ^ list.get(i);

        }
        return res;
    }
}