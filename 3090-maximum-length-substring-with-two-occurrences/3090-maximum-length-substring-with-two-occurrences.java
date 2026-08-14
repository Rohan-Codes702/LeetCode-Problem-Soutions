class Solution {
    public int maximumLengthSubstring(String s) {
        int n = s.length();

        HashMap<Character, Integer> map = new HashMap<>();

        int l = 0;
        int maxLen = 0;

            for (int i = 0; i < n; i++) {
                char ch = s.charAt(i);

                map.put(ch, map.getOrDefault(ch, 0) + 1);

                boolean iscorrrect = true;

                while(map.get(ch)>2) {
                        map.put(s.charAt(l), map.get(s.charAt(l)) - 1);
                        l++;
                        iscorrrect = false;
                    }

                
                if (iscorrrect) {
                    maxLen = Math.max(maxLen, i - l + 1);
                }
            }
        
        return maxLen;
    }
}