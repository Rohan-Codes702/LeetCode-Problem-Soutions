class Solution {
    public int secondHighest(String s) {
        TreeSet<Integer>set=new TreeSet<>();

        char[] str=s.toCharArray();

        for(char i:str){
            if (Character.isDigit(i)){
                set.add(i-'0');
            }
        }

        if (set.size()<2){
           return -1;

        }
        
           set.pollLast();
           int res=set.last();
        


      return res;
    }
}