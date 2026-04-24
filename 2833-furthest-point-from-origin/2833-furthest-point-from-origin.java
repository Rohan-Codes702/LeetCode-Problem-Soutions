class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int  count=0;

        char ch[]=moves.toCharArray();
        int L=0;
        int R=0;
        int U=0;
        for(int  i=0;i<ch.length;i++){
            if(ch[i]=='L'){
               L++;
            }
            else if(ch[i]=='R'){
                R++;
            }
            else{
                U++;
            }
        }
        int result=Math.abs(L-R)+U;
        return result;
    }
}