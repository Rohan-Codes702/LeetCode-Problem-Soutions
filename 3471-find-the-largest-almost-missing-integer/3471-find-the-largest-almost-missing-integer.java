class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;
        //HashSet<Integer> set = new HashSet<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int element = -1;
        if (k == 1) {
            for (int key : map.keySet()) {
                if (map.get(key) == 1 && key > element) {
                    element = key;
                }

            }
            return element;
        }

        if (k == n) {
            for (int key : map.keySet()) {
                if (key > element) {
                    element = key;
                }

            }
            return element;
        }

        if (map.get(nums[0]) == 1 && map.get(nums[n - 1]) == 1) {

            return Math.max(nums[0], nums[n - 1]);
        }
        if(map.get(nums[0])==1){
            return nums[0];
        }
         if(map.get(nums[n-1])==1){
            return nums[n-1];
        }

        return -1;

    }
}