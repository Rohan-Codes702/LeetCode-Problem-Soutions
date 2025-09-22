class Solution {
    public int maxFrequencyElements(int[] nums) {
        int n = nums.length;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int maxfreq = 0;
        for (int i : map.keySet()) {
            maxfreq = Math.max(map.get(i), maxfreq);
        }

        int count = 0;
        for (int i : map.keySet()) {
            if (map.get(i) == maxfreq) {
                count += maxfreq;
            }
        }
        return count;
    }
}