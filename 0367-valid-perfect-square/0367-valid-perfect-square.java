class Solution {
    public boolean isPerfectSquare(int num)
    {
        double a=Math.sqrt(num);
        
        if(num==(int)a*a)
        {
            return true;
        }
        return false;
    }
}