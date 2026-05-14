class Solution {
    public boolean isGood(int[] nums) {
        int n = nums.length;

        int max = 0;

        for (int i : nums) {
            max = Math.max(i, max);
        }
        if (max != n - 1) {
            return false;
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for(int i=1;i<max;i++){
            if(map.getOrDefault(i,0)!=1){
                return false;
            }
        }
        return true;

    }
}