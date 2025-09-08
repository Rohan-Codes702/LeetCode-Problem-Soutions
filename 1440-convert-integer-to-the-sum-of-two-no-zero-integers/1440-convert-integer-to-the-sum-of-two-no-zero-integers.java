class Solution {
    public boolean isnonzero(int num){
        while(num!=0){
            int rem=num%10;
            if(rem==0){
                return false;
            }
            num=num/10;
           
        }
         return true;
    }
    public int[] getNoZeroIntegers(int n) {
        int res[]=new int [2];

        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                    if((i+j)==n)
                    {
                        if(isnonzero(i) && isnonzero(j)){
                        res[0]=i;
                        res[1]=j;
                        return res;
                    }
                    }
            }
        }
        return res;
    }
}