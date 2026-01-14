class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[]result=new int[k];
        int n=nums.length;

        HashMap<Integer,Integer>map=new HashMap<>();

        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        List<Integer> keys = new ArrayList<>(map.keySet());
         Collections.sort(keys, (a, b) -> map.get(b) - map.get(a));

         for(int i=0;i<k;i++){
            result[i]=keys.get(i);
         }

         return result;
        
    }
}