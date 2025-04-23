class Solution {
    public int alternateDigitSum(int n) {
        String str=String.valueOf(n);
        int count=0;
        for(int i=0;i<str.length();i++){
            int digit=str.charAt(i)-'0';

            if(i%2==0){
                count=count+digit;

            }
            else
            {
                count=count-digit;
            }
        }
        return count;
    }
}