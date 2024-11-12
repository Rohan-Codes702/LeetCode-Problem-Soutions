class Solution {
    public boolean isAnagram(String s, String t)
    {
     
      char []schar=s.toCharArray();
      char []tchar=t.toCharArray();
        
        Arrays.sort(schar);
        Arrays.sort(tchar);
        
        String s1=new String(schar);
        String t1=new String(tchar);
        
        return s1.equals(t1);
        
        
    }
}