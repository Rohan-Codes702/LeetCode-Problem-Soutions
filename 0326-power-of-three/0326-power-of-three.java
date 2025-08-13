class Solution {
    public boolean isPowerOfThree(int n) {
            int num=n;

            if(num<=0){
                return false;
            }
            while(num%3==0){
                num=num/3;
            }

            if(num==1){
                return true;
            }
            return false; 
       
    }
}