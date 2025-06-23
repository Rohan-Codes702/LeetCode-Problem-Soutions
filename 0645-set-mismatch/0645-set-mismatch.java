class Solution {
    public int[] findErrorNums(int[] nums) {
        int n=nums.length;
        int res[]=new int[2];
        HashMap<Integer,Integer>map=new HashMap<>();

        for(int i:nums){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }
            else{
                map.put(i,1);
            }
        }

        for(int i=1;i<=n;i++){
            if(map.containsKey(i) && map.get(i)==2){
                res[0]=i;
            }
           if(!map.containsKey(i)){
            res[1]=i;
           }

        }
        return res;
    }
}