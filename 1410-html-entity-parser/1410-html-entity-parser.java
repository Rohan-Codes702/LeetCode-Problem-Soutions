class Solution {
    public String entityParser(String text) {
        StringBuilder str = new StringBuilder();


        for (int i = 0; i < text.length(); i++) {
            if (text.startsWith("&apos;",i)) {
                str.append("'");
                i=i+5;
            } else if (text.startsWith("&quot;",i)) {
                str.append(("\""));
                i=i+5;
            } else if (text.startsWith("&amp;",i)) {
                str.append("&");
                i=i+4;
            } else if (text.startsWith("&gt;",i)) {
                str.append(">");
                i=i+3;
            } else if (text.startsWith("&lt;",i)) {
                str.append("<");
                i=i+3;
            } else if (text.startsWith("&frasl;",i)) {
                str.append("/");
                i=i+6;
            } else {
                str.append(text.charAt(i));
            }
        }
        return str.toString();
    }
}