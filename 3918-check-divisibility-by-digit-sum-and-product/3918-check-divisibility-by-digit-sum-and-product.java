class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int product=1;
        int num=n;
        while(num!=0){
            int rem=num%10;

            sum+=rem;
            product*=rem;
              num=num/10;

        }

        if(n% (sum+product)==0){
            return true;
        }
        return false;
    }
}