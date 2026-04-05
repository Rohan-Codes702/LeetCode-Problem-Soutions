class Solution {
    public String reversePrefix(String word, char ch) {

        StringBuilder str = new StringBuilder();
        char chr[] = word.toCharArray();
        int idx=0;
        for (int i = 0; i < chr.length; i++) {
            str.append(chr[i]);
            idx++;
            if (chr[i] == ch) {
                str.reverse();
                break;
            }

        }

        for(int i=idx;i<chr.length;i++){
            str.append(chr[i]);
        }

        return str.toString();

    }
}