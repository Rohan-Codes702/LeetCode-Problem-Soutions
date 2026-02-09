class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
        List<Long> list = new ArrayList<>();
       
       for(int i:nums){
        long curr=i;

        while(!list.isEmpty() && list.get(list.size()-1)==curr){
            curr=list.remove(list.size()-1)+curr;
        }
        list.add(curr);
       }
       return list;
    }
}