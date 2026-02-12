class Solution {
    public int longestBalanced(String s) {
        int n = s.length();
        int maxLen = 0;
        for (int i = 0; i < n; i++) {
            HashMap<Character, Integer> map = new HashMap<>();

            for (int j = i; j < n; j++) {
                char ch = s.charAt(j);
                map.put(ch, map.getOrDefault(ch, 0) + 1);

                if (isbalance(map)) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }

            }

        }
        return maxLen;
    }

    public static boolean isbalance(HashMap<Character, Integer> map) {
        int freq = -1;
        for (int val : map.values()) {
            if (freq == -1) {
                freq = val;
            }
            if (freq != val) {
                return false;
            }
        }
        return true;

    }
}