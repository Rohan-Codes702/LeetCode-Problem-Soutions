class Solution {
    public int firstUniqueFreq(int[] nums) {
        int n=nums.length;

        HashMap<Integer,Integer>frqmap=new HashMap<>();

        for(int i:nums){
            frqmap.put(i,frqmap.getOrDefault(i,0)+1);
        }

        HashMap<Integer,Integer>frqcount=new HashMap<>();

        for(int i:frqmap.values()){
            frqcount.put(i,frqcount.getOrDefault(i,0)+1);
        }

        for(int i:nums){
            int freq=frqmap.get(i);

            if(frqcount.get(freq)==1){
                return i;
            }
        }
        return -1;


    }
}