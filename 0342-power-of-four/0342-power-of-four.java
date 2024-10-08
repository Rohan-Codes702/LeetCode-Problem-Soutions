class Solution {
    public boolean isPowerOfFour(int n) {
        return pow(n);
        
    }
    public static boolean pow(int  n)
    {
        if(n==1)
        {
           return true;
        }
        if(n==0)
        {
            return false;
        }
        if(n%4==0)
        {
            return pow(n/4);
        }
        else
        {
            return false;
        }
    }
}