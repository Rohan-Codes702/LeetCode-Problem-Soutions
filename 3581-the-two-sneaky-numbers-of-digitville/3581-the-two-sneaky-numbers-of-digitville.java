class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        int []result=new int[2];

        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int j=0;
        for(int key:map.keySet()){
            if(map.get(key)>1){
                result[j]=key;
                j++;
            }
        }

        return result;
    }
}