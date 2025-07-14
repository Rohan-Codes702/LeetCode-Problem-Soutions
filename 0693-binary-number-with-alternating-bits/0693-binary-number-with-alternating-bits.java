class Solution {
    public boolean hasAlternatingBits(int n) {
    
    int rem=n%2;
    n=n/2;

    while(n>0){
        int rem1=n%2;

        if(rem==rem1){
            return false;
        }
        rem=rem1;
        n=n/2;
    }
    return true;

    }
}