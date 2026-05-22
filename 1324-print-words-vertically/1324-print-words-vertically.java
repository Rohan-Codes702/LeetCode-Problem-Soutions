class Solution {
    public List<String> printVertically(String s) {
        List<String> list = new ArrayList<>();
        int n = s.length();
        String str[] = s.split(" ");

        int maxlength = 0;

        for (String word : str) {
            maxlength = Math.max(maxlength, word.length());
        }

        for (int i = 0; i < maxlength; i++) {
            StringBuilder sb = new StringBuilder();

            for (String word : str) {

                if (i < word.length()) {
                    sb.append(word.charAt(i));
                } else {
                    sb.append(" ");
                }

               
            }
             while (sb.length() > 1 && sb.charAt(sb.length() - 1) == ' ') {
                    sb.deleteCharAt(sb.length() - 1);
                }
            list.add(sb.toString());

        }

        return list;
    }
}