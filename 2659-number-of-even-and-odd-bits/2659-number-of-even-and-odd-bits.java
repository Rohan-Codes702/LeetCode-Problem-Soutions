class Solution {
    public int[] evenOddBit(int n) {
        int []res=new int[2];
        int even=0;
        int odd=0;

        for(int i=0;i<31;i++){
            int bit=n&1;

            if(i%2==0){
                if(bit==1){
                    even++;
                }
            }
            else{
                if(bit==1){
                    odd++;
                }
            }
            n=n>>1;
        }

        res[0]=even;
        res[1]=odd;

        return res;
    }
}