class Solution {
    public boolean isPalindromic(String s) {
        StringBuilder str=new StringBuilder();

        for(char ch:s.toCharArray()){
            int nm=(int)ch;
            
            String st=Integer.toBinaryString(nm);
            while(st.length()<8){
                st="0"+st;
            }
            str.append(st);
        }

        int i=0;
        int j=str.length()-1;

        while(i<=j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
}
}