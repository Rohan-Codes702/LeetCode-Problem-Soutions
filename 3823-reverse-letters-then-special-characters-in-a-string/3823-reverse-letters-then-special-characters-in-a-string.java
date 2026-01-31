class Solution {
    public String reverseByType(String s) {
        int n = s.length();
       

        StringBuilder letter =new StringBuilder();
        StringBuilder symbol =new StringBuilder();

        for(char ch:s.toCharArray()){
            if(Character.isLetter(ch)){
                letter.append(ch);
            }
            else{
                symbol.append(ch);
            }
        }

        int i=letter.length() -1;
        int j=symbol.length() -1;

        StringBuilder ans =new StringBuilder();
        for(char ch :s.toCharArray()){
            if(Character.isLetter(ch)){
                ans.append(letter.charAt(i--));
            }
            else{
                ans.append(symbol.charAt(j--));
            }
        }

        return ans.toString();

    }
}
