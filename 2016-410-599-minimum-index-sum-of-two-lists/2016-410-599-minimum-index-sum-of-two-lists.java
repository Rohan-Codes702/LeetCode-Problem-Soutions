class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        int n=list1.length;
        int m=list2.length;

        HashMap<String,Integer>map=new HashMap<>();

        for(int i=0;i<n;i++ ){
            map.put(list1[i],i);
        }

        ArrayList<String>list=new ArrayList<>();
        int min=Integer.MAX_VALUE;

        for(int i=0;i<m;i++){
            if(map.containsKey(list2[i])){
                int count=i+map.get(list2[i]);

                if(count<min){
                    min=count;
                    list.clear();
                    list.add(list2[i]);
                }

                else if(count==min){
                    list.add(list2[i]);
                }

            }
        }
        return list.toArray(new String[0]);




    }
}