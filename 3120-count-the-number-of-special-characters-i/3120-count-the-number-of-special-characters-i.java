class Solution {
    public int numberOfSpecialChars(String word) {
        int n = word.length();

        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            set.add(word.charAt(i));
        }
        ArrayList<Character>list=new ArrayList<>(set);

        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (Character.isLowerCase(list.get(i))) {
                char ch = list.get(i);

                if (set.contains(Character.toUpperCase(ch))) {
                    count++;
                }
            }

        }

        return count;

    }
}