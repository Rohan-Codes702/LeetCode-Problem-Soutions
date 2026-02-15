class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        List<Integer>list=new ArrayList<>();
        
        HashMap<Integer,Integer>map=new HashMap<>();

        for(int i=0;i<bulbs.size();i++){
            map.put(bulbs.get(i),map.getOrDefault(bulbs.get(i),0)+1);
        }

        for(int i:map.keySet()){
            if(map.get(i)%2!=0){
                list.add(i);
            }
        }

        Collections.sort(list);
        return list;
    }
}