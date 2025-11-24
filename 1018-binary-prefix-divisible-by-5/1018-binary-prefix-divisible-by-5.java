class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean>list=new ArrayList<>();

        int n=nums.length;
        int value=0;
        for(int i=0;i<n;i++){
            value=(2*value+nums[i])%5;
            list.add(value==0);
        }
        return list;
    }
}