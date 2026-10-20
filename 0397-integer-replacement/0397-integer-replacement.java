class Solution {
    public int integerReplacement(int n) {
        int ans=0;

        int num=n;

        while(num!=1){
            if(num%2==0){
                num=num/2;
                ans++;
            }
            else{
                if(num==3 || num%4==1){
                    num=num-1;
                    ans++;
                }
                else{
                    num=num+1;
                    ans++;
                }
            }
        }
        return ans;
    }
}