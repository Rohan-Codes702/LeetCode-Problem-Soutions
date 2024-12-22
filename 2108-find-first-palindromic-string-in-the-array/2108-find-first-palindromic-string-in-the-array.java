class Solution {

public boolean palindrome(String s)
{
    int start=0;
    int end=s.length()-1;
    
    while(start<=end)
    {
        if(s.charAt(start)!=s.charAt(end))
        {
            return false;
        }
        start++;
        end--;
        
    }
    return true;
}



    public String firstPalindrome(String[] words) {
        
        for(String w:words)
        {
            if(palindrome(w))
            {
                return w;
            }
        }
        return"";
        
        
    }
}