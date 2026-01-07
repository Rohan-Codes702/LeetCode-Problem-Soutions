class Solution {
    public int maxVowels(String s, int k) {
        int n = s.length();
        int l = 0;
        int count = 0;
        for (int i = l; i <= k - 1; i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        int max = count;
        int sub = count;

        for (int r = k; r < n; r++) {
            char chr = s.charAt(l);
            if (chr == 'a' || chr == 'e' || chr == 'i' || chr == 'o' || chr == 'u') {
                 sub = sub - 1;
            }
           
            l++;
            char ch = s.charAt(r);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                sub++;
            }
            max = Math.max(max, sub);
        }
        return max;
    }
}