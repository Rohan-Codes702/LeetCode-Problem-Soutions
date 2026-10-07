class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        String s = licensePlate.toLowerCase();

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetter(ch)) {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }

        }
        String ans = "";

        for (int j = 0; j < words.length; j++) {
            HashMap<Character, Integer> wordmap = new HashMap<>();

            String str = words[j];
            boolean iscorrect = true;
            for (int k = 0; k < str.length(); k++) {
                char ch = str.charAt(k);
                wordmap.put(ch, wordmap.getOrDefault(ch, 0) + 1);

            }

            for (char key : map.keySet()) {
                if (wordmap.getOrDefault(key, 0) < map.getOrDefault(key, 0)) {
                    iscorrect = false;
                    break;
                }
            }
            if (iscorrect) {
                if(ans.equals("") || str.length() < ans.length())
                ans = str;

            }
        }
        return ans;

    }
}