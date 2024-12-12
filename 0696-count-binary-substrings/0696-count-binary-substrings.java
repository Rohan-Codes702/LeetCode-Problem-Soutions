class Solution {
    public int countBinarySubstrings(String s) 
    {
         int j = 0;
        int i =1;
        int c = 0;
        for (int z = 1; z < s.length(); z++){
            if (s.charAt(z) == s.charAt(z-1))
            {
                i++;
            }
            else {
                j = i;
                i = 1;
            }
            
            if (j >= i)
            {
                c++;
            }
        }
        return c;
    }



}




