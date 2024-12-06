class Solution {
    public boolean judgeSquareSum(int c) 
    {
      int s=0;
        int e=(int)Math.sqrt(c);
                
        while(s<=e)
        {
            long sum=(long)e*e+(long)s*s;
            
            if(sum==c)
            {
                return true;
            }
            else if(sum<c)
            {
                s++;
            }
            else
            {
                e--;
            }

            
            
        }
        return false;
    }
}

