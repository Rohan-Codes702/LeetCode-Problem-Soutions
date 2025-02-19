class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){

            map.put(nums[i],i);
        }

     
     

        for(int i=0;i<operations.length;i++){
            

                if(map.containsKey(operations[i][0])){
                    int ind=map.get(operations[i][0]);
                    nums[ind]=operations[i][1];
                    map.put(operations[i][1],ind);

                }




        }
        return nums;
    




    }
}