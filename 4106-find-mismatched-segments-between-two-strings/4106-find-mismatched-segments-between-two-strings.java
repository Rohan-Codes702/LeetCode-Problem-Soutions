class Solution {
    public List<List<String>> findMismatchedSegments(String s1, String s2) {
        List<List<String>> ans = new ArrayList<>();
        List<String> list = new ArrayList<>();
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            while (i < s1.length() && s1.charAt(i) != s2.charAt(i)) {
                str1.append(s1.charAt(i));
                str2.append(s2.charAt(i));
                i++;
            }
            if (str1.length() > 0) {
                list.add(str1.toString());
                list.add(str2.toString());

                ans.add(new ArrayList<>(list));
                list.clear();
                str1.setLength(0);
                str2.setLength(0);
            }
        }
        return ans;

    }
}