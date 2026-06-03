class Solution {
    public List<String> commonChars(String[] words) {
        List<String> list = new ArrayList<>();
        int n = words.length;

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : words[0].toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (int i = 1; i < n; i++) {
            HashMap<Character, Integer> curr = new HashMap<>();
            String word = words[i];

            for (char ch : word.toCharArray()) {
                curr.put(ch, curr.getOrDefault(ch, 0) + 1);

            }

            for (char ch : new HashSet<>(map.keySet())) {
                if (curr.containsKey(ch)) {
                    map.put(ch, Math.min(map.get(ch), curr.get(ch)));
                } else {
                    map.remove(ch);
                }
            }
        }
        for (char ch : map.keySet()) {
            int freq = map.get(ch);

            while (freq-- > 0) {
                list.add(String.valueOf(ch));
            }
        }

        return list;

    }
}