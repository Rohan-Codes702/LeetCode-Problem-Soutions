class Solution {
    public long countSubstrings(String s, char c) {
        int n=s.length();

        HashMap<Character,Integer>map=new HashMap<>();

        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int freq=map.getOrDefault(c,0);

        return (long)freq*(freq+1)/2;
    }
}