class Solution {
    public int bitwiseComplement(int n) {
        String num=Integer.toBinaryString(n);
        StringBuilder str=new StringBuilder();

        for(int i=0;i<num.length();i++){
            char ch=num.charAt(i);

            if(ch=='0'){
                str.append('1');
            }
            else{
                str.append('0');
            }
        }

        return Integer.parseInt(str.toString(),2);




    }
}