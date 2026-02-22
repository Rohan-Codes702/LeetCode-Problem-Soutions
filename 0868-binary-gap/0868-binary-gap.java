class Solution {
    public int binaryGap(int n) {
        int maxgap=0;
        int last=-1;
        int index=0;
        for(int i=0;i<31;i++){
            if((n&1)==1){
                if(last!=-1){
                maxgap=Math.max(maxgap,index-last);
                }
                 last=index;
            }
           
            n=n>>1;
            index++;
        }
        return maxgap;
    }
}