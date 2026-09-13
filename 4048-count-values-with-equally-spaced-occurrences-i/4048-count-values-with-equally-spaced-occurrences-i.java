class Solution {
    public int countSpecialIntegers(int[] nums) {
        int n = nums.length;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            if (!set.contains(nums[i]) && map.get (nums[i])== 3) {
                int idx = 0;
                int idx1 = -1;
                int idx2 = -1;
                int idx3 = -1;
                for (int key=0;key<n;key++) {
                    if (nums[key] == nums[i]) {
                        idx++;
                        if (idx == 1) {
                            idx1 = key;
                        } else if (idx == 2) {
                            idx2 = key;
                        } else {
                            idx3 = key;
                        }
                    }

                }
                if ((idx2 - idx1) == (idx3 - idx2)) {
                    count++;
                }
                set.add(nums[i]);
            }
        }
        return count;

    }
}