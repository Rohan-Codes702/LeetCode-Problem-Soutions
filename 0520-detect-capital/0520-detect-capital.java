class Solution {
    public boolean detectCapitalUse(String word) {
        int n = word.length();

        String w1 = word.toUpperCase();
        if (w1.equals(word)) {
            return true;
        }

        String w2 = word.toLowerCase();
        if (w2.equals(word)) {
            return true;
        }

        String w3=word.substring(0,1).toUpperCase();
        String w4 =word.substring(1).toLowerCase();

        if((w3+w4).equals(word)){
            return true;
        }

        return false;

    }
}