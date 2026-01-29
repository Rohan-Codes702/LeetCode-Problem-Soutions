class Solution {
    public String truncateSentence(String s, int k) {
       StringBuilder str=new StringBuilder();
        String[]res=s.split(" ");

        for(int i=0;i<k;i++){
            str.append(res[i]+" ");
        }
        return str.toString().trim();
    }
}