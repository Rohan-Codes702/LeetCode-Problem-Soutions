class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        int n = s.length();
        int r = p.length();

        if (n < r) return list;

        String sortedP = sortString(p);   // sorted once

        String str = "";
        for (int l = 0; l < r; l++) {
            str += s.charAt(l);
        }

        if (helper(sortedP, str)) {   // ✅ FIX
            list.add(0);
        }

        for (int j = r; j < n; j++) {
            str = str.substring(1);
            str += s.charAt(j);

            if (helper(sortedP, str)) {   // ✅ FIX
                list.add(j - r + 1);
            }
        }

        return list;
    }

    public static boolean helper(String sortedP, String str) {
        char[] b = str.toCharArray();
        Arrays.sort(b);
        return sortedP.equals(new String(b));
    }

    public static String sortString(String s) {
        char[] a = s.toCharArray();
        Arrays.sort(a);
        return new String(a);
    }
}
