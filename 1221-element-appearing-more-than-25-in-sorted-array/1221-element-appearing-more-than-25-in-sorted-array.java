class Solution {
    public int findSpecialInteger(int[] arr) {
        int n=arr.length;
        HashMap<Integer,Integer>map=new HashMap<>();

        for (int i=0;i<n;i++){
            if (map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);

            }
            else{
                map.put(arr[i],1);
            }
        }
        int large=0;
        int res=0;
        for (int i:map.keySet()) {
           int freq=map.get(i);

           if (freq>large){
               large=freq;
               res=i;
           }
        }
        return res;
    }
}