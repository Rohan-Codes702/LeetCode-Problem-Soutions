class Solution {
    public int[] frequencySort(int[] nums) {

        HashMap<Integer,Integer>map=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }

        PriorityQueue<int[]> pq=new PriorityQueue<>(new Comparator<int[]>(){
            public int compare(int[]p,int[]q){
                if(p[1]!=q[1]){
                    return p[1]-q[1];
                }

                return q[0]-p[0];
            }
        });

        for(Integer key:map.keySet()){
            int[] arr=new int[2];
            arr[0]=key;
            arr[1]=map.get(key);
            pq.add(arr);
        }
        int i=0;
        while(!pq.isEmpty()){
            int[]arr=pq.remove();
            for(int j=0;j<arr[1];j++){
                nums[i++]=arr[0];
            }

        }



    
        return nums;


        
    }
}