class Solution {
    public int beautySum(String s) {
        int n = s.length();
        int beuty = 0;
        for (int i = 0; i < n; i++) {
            HashMap<Character, Integer> map = new HashMap<>();
            for (int j = i; j < n; j++) {
                map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);

                int min = Integer.MAX_VALUE;
                int max = 0;

                for (char key : map.keySet()) {
                    int val=map.get(key);
                    max=Math.max(max,val);
                    min=Math.min(min,val);
                }

               beuty+=max-min;
            }

        }
        return beuty;
    }
}