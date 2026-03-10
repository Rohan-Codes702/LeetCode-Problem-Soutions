class Solution {
    public int minSteps(String s, String t) {
        int n1 = s.length();
        int n2 = t.length();
        int result=0;
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (int i=0;i<n1;i++) {
            char ch=s.charAt(i);
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        }
        for (int i=0;i<n2;i++) {
            char chr=t.charAt(i);
            map2.put(chr, map2.getOrDefault(chr, 0) + 1);
        }

        for(int i=0;i<n1;i++){
            char ch=s.charAt(i);

            if(map1.get(ch)>map2.getOrDefault(ch,0)){
                int diff=map1.get(ch)-map2.getOrDefault(ch,0);
                result+=diff;
                map1.put(ch,map2.getOrDefault(ch,0));
            }
        }
        return result;

    }
}