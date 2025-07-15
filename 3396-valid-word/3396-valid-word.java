class Solution {
    public boolean isValid(String word) {
        int n=word.length();

        String str=word.toLowerCase();
        int vowel=0;
        int consonant=0;
        for(int i=0;i<n;i++){
            char c=str.charAt(i);
            if(Character.isLetter(c)){
            if(c =='a' || c =='e' || c =='i' || c =='o' || c =='u'){
                vowel++;
            }

          else{
                consonant++;
            }
            }
            if(!Character.isDigit(c) && !Character.isLetter(c)){
                return false;
            }
        }

        if(n>=3 && vowel>=1 && consonant>=1){
            return true;
        }
        return false;
    }
}