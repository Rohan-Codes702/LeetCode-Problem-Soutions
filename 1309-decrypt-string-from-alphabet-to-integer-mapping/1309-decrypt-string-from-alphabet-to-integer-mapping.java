class Solution {
    public String freqAlphabets(String s) {
        StringBuilder str=new StringBuilder();

        for(int i=s.length()-1;i>=0;i--){
            String st="";
            if(s.charAt(i)=='#'){
                st+=s.charAt(i-2);
                st+=s.charAt(i-1);
                i=i-2;
            }
            else{
                st+=s.charAt(i);
            }
            str.append((char)('a'+Integer.parseInt(st)-1));
        }
        return str.reverse().toString();
    }
}