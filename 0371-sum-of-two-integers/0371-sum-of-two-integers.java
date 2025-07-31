class Solution {
    public int getSum(int a, int b) {
      
      while(b!=0){
        int num=a&b;

         a=a^b;

        b=num<<1;
        
      }
      return a;
    }
}