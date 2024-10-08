class Solution {
    public boolean isPowerOfTwo(int n) {
       return pow(n);
    }
    public static boolean pow(int n)
    {
        if(n==0){
            return false;
        }
        if(n==1)
        {
            return true;
        }
            
        if(n%2==0){
           return pow(n/2);
        }
        else{
            return false ;
        }
    }
}