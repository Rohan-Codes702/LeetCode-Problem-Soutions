class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int n=allowed.length();
        HashSet<Character>set=new HashSet<>();
        for(int i=0;i<n;i++){
            char ch=allowed.charAt(i);
            set.add(ch);
        }
            int count=0;

        for(String w:words){
                int flag=1;
            for(int i=0;i<w.length();i++){
            char ch=w.charAt(i);

            if(!set.contains(ch)){
                flag=0;
            }
           
            }
             count+=flag;

        }
        return count;
    }
}