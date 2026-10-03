class Solution {
    public String capitalizeTitle(String title) {
        StringBuilder str = new StringBuilder();
        int n = title.length();
        String[] arr = title.split(" ");
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            int len = s.length();
            StringBuilder bstr = new StringBuilder();
            if (len > 2) {
                for (int j = 0; j < len; j++) {
                    if (j == 0) {
                        bstr.append(Character.toUpperCase(s.charAt(j)));
                    } else {
                        bstr.append(Character.toLowerCase(s.charAt(j)));
                    }
                }
                str.append(bstr);
            }

            else {
                for (int k = 0; k < len; k++) {
                    bstr.append(Character.toLowerCase(s.charAt(k)));
                }
                str.append(bstr);
            }
            if(i<arr.length-1){
                str.append(" ");
            }
        }
        return str.toString();
    }
}