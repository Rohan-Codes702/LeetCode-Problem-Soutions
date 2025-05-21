class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
      int org=x;
        int sum=0;

        while(x!=0){
            int rem=x%10;
            sum+=rem;
            x/=10;

            
        }
         if((org%sum)==0){
            return sum;
        }
       

        return -1;
    }
}