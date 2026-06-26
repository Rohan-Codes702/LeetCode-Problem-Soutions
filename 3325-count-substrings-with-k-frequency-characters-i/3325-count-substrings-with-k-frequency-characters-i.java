class Solution {
    public int numberOfSubstrings(String s, int k) {
        int n = s.length();

        int ans = 0;
        int l = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            while (map.get(ch) == k) {
                map.put(s.charAt(l), map.get(s.charAt(l)) - 1);
                l++;
            }
            ans += l;
        }
        return ans;
    }
}