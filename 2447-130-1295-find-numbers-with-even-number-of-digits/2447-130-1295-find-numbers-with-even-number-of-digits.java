class Solution {
    public int findNumbers(int[] nums) {
        int n=nums.length;
        int c=0;
        for(int i=0;i<n;i++){
            
            if(getDigits(nums[i])%2==0){
                c++;
            }
        }
        
        return c;
    }
    
    private int getDigits(int a){
        int c=0;
        while(a!=0){
            a/=10;
            c++;
        }
        return c;
    }
}