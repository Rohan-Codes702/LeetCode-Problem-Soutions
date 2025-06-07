class Solution {
    public int maxFrequencyElements(int[] nums) {
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

        int maxfreq=0;

        for(int key:map.keySet()){
            maxfreq=Math.max(maxfreq,map.get(key)); 
        }


        int count=0;

        for(int key:map.keySet()){
            if(map.get(key)==maxfreq){
                count+=maxfreq;
            }
        }
        return count;
    }
}