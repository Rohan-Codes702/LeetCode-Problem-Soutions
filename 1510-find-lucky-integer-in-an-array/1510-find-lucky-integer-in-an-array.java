class Solution {
    public int findLucky(int[] arr) {
        int n=arr.length;

        HashMap<Integer,Integer>map=new HashMap<>();

        for(int i:arr){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }
            else{
                map.put(i,1);
            }
        }

        int max=-1;

        for(int key:map.keySet()){

            if(map.get(key)==key){
                max=Math.max(max,key);
            }
           
        }
        return max;
    }
}