class Solution {
    public String largestGoodInteger(String num) {
        String str="";

        for(int i=0;i<=num.length()-3;i++){
            char ch=num.charAt(i);

            if((num.charAt(i+1)==ch && num.charAt(i+2)==ch)){
                String curr=""+ch+ch+ch;
                
                 if(curr.compareTo (str) >0){
                str=curr;
            }
            }
           
        }
        return str;
    }
}