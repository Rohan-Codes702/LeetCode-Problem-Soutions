class Solution {
    public int mostFrequentEven(int[] nums) {
       HashMap<Integer,Integer>map=new HashMap<>();

       for(int i:nums){
        if(i%2==0){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }
            else
            {
                map.put(i,1);
            }
        }
       }

       int result=-1;
         int maxFreq=0;

       for(int key:map.keySet()){

        if (map.get(key) > maxFreq || (map.get(key) == maxFreq && key < result)) {
                maxFreq = map.get(key);
                result = key;
            }
        }

        return result;
    }
}