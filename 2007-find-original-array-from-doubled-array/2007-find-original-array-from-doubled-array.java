class Solution {
    public int[] findOriginalArray(int[] changed) {
        int n = changed.length;
        int idx = 0;
        int[] ans = new int[changed.length / 2];

        HashMap<Integer, Integer> map = new HashMap<>();
        if (n % 2 != 0) {
            return new int[] {};
        }

        for (int i : changed) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        Arrays.sort(changed);
        for (int i = 0; i < n; i++) {

            if (map.getOrDefault(changed[i], 0) == 0) {
                continue;
            }
            int val = changed[i] * 2;
           if (map.getOrDefault(val, 0) > 0 && (changed[i] != val || map.get(changed[i]) > 1)) { 
                ans[idx++] = changed[i];

                map.put(changed[i], map.get(changed[i]) - 1);
                map.put(val, map.get(val) - 1);

            } else {
                    return new int[]{};
            }
            if (idx == n / 2) {
                return ans;
            }
        }

        return new int[] {};
    }
}