class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        int n=nums.length;

        for(int num:nums){
            set.add(num);
        }

        ArrayList<Integer>list=new ArrayList<>();
        for(int i=1;i<=n;i++){
           if(!set.contains(i)){
            list.add(i);
           }
        }
        return list;

    }
}