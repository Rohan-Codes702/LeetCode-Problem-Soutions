class Solution {
    public String toGoatLatin(String sentence) {
        String[] arr = sentence.split(" ");
        int n = arr.length;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String str = arr[i];

            if (str.charAt(0) == 'a' || str.charAt(0) == 'e' || str.charAt(0) == 'i' || str.charAt(0) == 'o'
                    || str.charAt(0) == 'u' || str.charAt(0) == 'A' || str.charAt(0) == 'E' || str.charAt(0) == 'I'
                    || str.charAt(0) == 'O' || str.charAt(0) == 'U') {
                sb.append(str);
                sb.append("ma");
                int idx = i + 1;
                while (idx != 0) {
                    sb.append('a');
                    idx--;
                }
                sb.append(" ");

            } else {
                for (int k = 1; k < str.length(); k++) {
                    sb.append(str.charAt(k));
                }
                sb.append(str.charAt(0));
                sb.append("ma");

                int idx = i + 1;
                while (idx != 0) {
                    sb.append('a');
                    idx--;
                }
                sb.append(" ");

            }

        }
        return sb.toString().trim();
    }
}