class Solution {
    public List<Integer> intersection(int[][] nums) {

        TreeMap<Integer,Integer>map=new TreeMap<>();
        int n=nums.length;

        for(int i=0;i<n;i++){
            for(int j=0;j<nums[i].length;j++){

            if(map.containsKey(nums[i][j])){
                map.put(nums[i][j],map.get(nums[i][j])+1);
            }
            else
            {
                map.put(nums[i][j],1);
            }
        }
        }

        ArrayList<Integer>list=new ArrayList<>();

        for(Integer result:map.keySet()){
            if(map.get(result)==n){
                list.add(result);
            }
        }
       
        return list;


    }
}