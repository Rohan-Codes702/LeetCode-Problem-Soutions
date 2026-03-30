class Solution {
    public boolean checkStrings(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();

        HashMap<Character, Integer> evenmp = new HashMap<>();
        HashMap<Character, Integer> oddmp = new HashMap<>();

        for (int i = 0; i < n; i++) {
            char ch = s1.charAt(i);
            if (i % 2 == 0) {
                evenmp.put(ch, evenmp.getOrDefault(ch, 0) + 1);
            } else {
                oddmp.put(ch, oddmp.getOrDefault(ch, 0) + 1);

            }
        }

        for (int i = 0; i < m; i++) {
            char ch = s2.charAt(i);

            if (i % 2 == 0) {
                evenmp.put(ch, evenmp.getOrDefault(ch, 0) - 1);
            } else {
                oddmp.put(ch, oddmp.getOrDefault(ch, 0) - 1);

            }
        }

        for(int val:evenmp.values()){
            if(val!=0){
                return false;
            }
        }
        for(int val:oddmp.values()){
            if(val!=0){
                return false;
            }
        }
        return true;

    }
}