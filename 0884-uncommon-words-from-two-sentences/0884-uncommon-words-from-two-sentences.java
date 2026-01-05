import java.util.*;

class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {

        String[] w1 = s1.split(" ");
        String[] w2 = s2.split(" ");

        String[] str = new String[w1.length + w2.length];
        int j = 0;

        HashMap<String, Integer> map = new HashMap<>();

        
        for (int i = 0; i < w1.length; i++) {
            map.put(w1[i], map.getOrDefault(w1[i], 0) + 1);
        }

        for (int i = 0; i < w2.length; i++) {
            map.put(w2[i], map.getOrDefault(w2[i], 0) + 1);
        }

        for (String key : map.keySet()) {
            if (map.get(key) == 1) {
                str[j++] = key;
            }
        }

        return Arrays.copyOf(str, j);
    }
}
