class Solution {
    public boolean isPowerOfFour(int n) {
        int num=n;
        if(num<1){
            return false;
        }
    
        while(num%4==0){
            num=num/4;
            
        }
        if(num==1){
            return true;
        }
        return false;
    }
}