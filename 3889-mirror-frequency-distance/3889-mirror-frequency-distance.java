class Solution {
    public int mirrorFrequency(String s) {
        int n = s.length();
        int ans = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            char mirror;
            if (Character.isLetter(arr[i])) {
                mirror = (char) ('z' - (arr[i] - 'a'));
            } else {
                mirror = (char) ('9' - (arr[i] - '0'));
            }
            if (map.containsKey(arr[i])) {
                int freq1 = map.getOrDefault(arr[i], 0);
                int freq2 = map.getOrDefault(mirror, 0);
                ans += Math.abs(freq1 - freq2);
                map.remove(arr[i]);
                 map.remove(mirror);
            }

        }
        return ans;
    }
}