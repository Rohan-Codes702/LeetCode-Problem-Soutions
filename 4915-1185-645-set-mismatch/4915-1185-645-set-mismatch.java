class Solution {
    public int[] findErrorNums(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int n=nums.length;

        for(int i:nums){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }
            else{
                map.put(i,1);
            }
        }
        int num=0;
        int[]result=new int[2];
        for(int key:map.keySet())
    {
            if(map.get(key)>1){
                num=key;

            }
            
        }

        for(int i=1;i<=nums.length;i++){
            if(!map.containsKey(i)){
                result= new int[]{num,i};
                break;
            }
        }
        return result;
    }
}