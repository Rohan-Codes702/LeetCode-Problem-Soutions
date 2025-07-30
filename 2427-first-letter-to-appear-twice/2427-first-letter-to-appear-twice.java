class Solution {
    public char repeatedCharacter(String s) {
        int n=s.length();
        HashSet<Character>set=new HashSet<>();

        set.add(s.charAt(0));

        for(int i=1;i<n;i++){
            if(set.contains(s.charAt(i))){
                return s.charAt(i);
            }
            else{
                set.add(s.charAt(i));
            }
        }
        return 'a';
    }
}