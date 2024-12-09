class Solution {
    public boolean isPalindrome(String s)
    {
        
        s=s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        int n=s.length();
          int i,j;
        for( i=0,j=n-1;i<=j;i++,j--)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                return false;
            }
        }
        return true;
    }
}