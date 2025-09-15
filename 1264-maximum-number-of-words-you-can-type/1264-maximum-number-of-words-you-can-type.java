class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int n=text.length();
        int count=0;
       
        String words[]=text.split(" ");

        for(int i=0;i<words.length;i++){
            String wd=words[i];
             HashSet<Character>set=new HashSet<>();

             for(int j=0;j<wd.length();j++){
                char ch=wd.charAt(j);
                set.add(ch);
             }

             boolean istype=true;
             for(int p=0;p< brokenLetters.length();p++){
                char ch= brokenLetters.charAt(p);

                if(set.contains(ch)){
                   istype=false;
                }
            
             }

             if(istype){
                count++;
             }

             set.clear();
            

        }
         return count;
    }
}