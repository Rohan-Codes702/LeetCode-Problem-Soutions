class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int n=arr.length;

        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);

            }
            else
            {
                map.put(arr[i],1);
            }
        }

        HashSet<Integer>set=new HashSet<>();

        for(Integer key:map.keySet()){
            set.add(map.get(key));
        }

        return map.size()==set.size();

    }
}