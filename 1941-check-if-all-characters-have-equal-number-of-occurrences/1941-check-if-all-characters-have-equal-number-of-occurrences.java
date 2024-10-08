class Solution {
    public boolean areOccurrencesEqual(String s) {

        HashMap<Character,Integer> map=new HashMap<>();

          int n=s.length();
        for(int i=0;i<n;i++)
        {
            if(map.containsKey(s.charAt(i)))
            {
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
            else
            {
                map.put(s.charAt(i),1);
            }
        }
        boolean flag=true;

        int f=map.get(s.charAt(0));

        for(int i=0;i<n-1;i++)
        {
            if(f!=map.get(s.charAt(i)))
            {
                flag=false;
            }
        
        }
        return flag;
        
    }
}