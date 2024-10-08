class Solution {
    public boolean isPowerOfThree(int n) {
       return pow(n);
        
    }
    public static boolean pow(int n)
    {
        if(n==0)
        {
            return false;
        }
        if(n==1)
        {
            return true;
        }
        if(n%3==0)
        {
            return  pow(n/3);
        }
        else
        {
            return false;
        }

    }
}