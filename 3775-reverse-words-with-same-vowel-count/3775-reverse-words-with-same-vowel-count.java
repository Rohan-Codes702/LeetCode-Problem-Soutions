class Solution {
    public String reverseWords(String s) {
        String[] str = s.split(" ");
        StringBuilder stre = new StringBuilder();
        int n = str.length;

        int count = 0;

        for (int i = 0; i < str[0].length(); i++) {
            char ch = str[0].charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        stre.append(str[0]);
        if (n > 1) {
            stre.append(" ");
        }
        for (int i = 1; i < str.length; i++) {
            if (vowelcount(str[i]) == count) {
                String st = new StringBuilder(str[i]).reverse().toString();
                stre.append(st);
                if (i < n - 1) {
                    stre.append(" ");
                }

            } else {
                stre.append(str[i]);
                if (i < n - 1) {
                    stre.append(" ");
                }
            }
        }

        return stre.toString();

    }

    public static int vowelcount(String str) {
        char ch[] = str.toCharArray();
        int count = 0;

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
                count++;
            }
        }
        return count;
    }
}