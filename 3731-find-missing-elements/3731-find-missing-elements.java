class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int n = nums.length;

        Arrays.sort(nums);
        HashSet<Integer>set=new HashSet<>();

        for(int i:nums){
            set.add(i);
        }
        int start = nums[0];
        int end = nums[n - 1];

        for (int i = start; i <= end; i++) {
           if(!set.contains(i)){
            list.add(i);
           }
        }
        return list;
    }
}