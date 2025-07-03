import java.util.HashMap;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<>();
        String[] words = s.split(" ");

        if (pattern.length() != words.length) { 
            return false;
        }

        HashMap<String, Character> reverseMap = new HashMap<>(); 

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];

            if (map.containsKey(c)) {
                if (!map.get(c).equals(word)) {
                    return false;
                }
            } else {
                if (reverseMap.containsKey(word)) {
                    return false;
                }
                map.put(c, word);
                reverseMap.put(word, c);
            }
        }
        return true;
    }
}