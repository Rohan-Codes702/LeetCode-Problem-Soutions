class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int pro=1;

        int num=n;
        while(num!=0){
            int rem=num%10;
            sum+=rem;
            pro*=rem;
            num/=10;
        }
        int div=sum+pro;
        if(n%div==0){
            return true;
        }
        return false;
    }
}