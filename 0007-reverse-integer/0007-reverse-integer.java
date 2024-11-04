class Solution {
    public int reverse(int x)
    {
        int  sum =0;
        
        while(x!=0)
        {
            int rem=x%10;
            int result=sum*10+rem;
            
            if((result-rem)/10 !=sum)
            {
                return 0;
            }
            sum=result;
            x=x/10;
        }
        return sum;
    }
}