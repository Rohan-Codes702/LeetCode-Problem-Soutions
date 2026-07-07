class Solution {
    public long sumAndMultiply(int n) {
        if(n==0){
            return 0;
        }
        int sum=0;
        StringBuilder str=new StringBuilder();
        int num=n;
        while(num!=0){
            int rem=num%10;
           if(rem!=0){
            str.append(rem);
            sum+=rem;
           }
           num=num/10;
            
        }
        String st=str.reverse().toString();
        long number=Long.parseLong(st);

        return number*sum;
    }
}